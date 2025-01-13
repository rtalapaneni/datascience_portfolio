package com.tgc.rea.service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.tgc.rea.dto.Page;
import com.tgc.rea.dto.Pageable;
import com.tgc.rea.dto.SaleDTO;
import com.tgc.rea.model.SaleModel;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class RealEstateDataService {
    @Value("${dataset.training}")
    private String trainingDataset;

    private ModelMapper modelMapper;

    public RealEstateDataService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Flux<SaleModel> readSaleDataStream() {
        ClassPathResource classPathResource = new ClassPathResource(trainingDataset);

        try (FileReader reader = new FileReader(classPathResource.getFile())) {
            CsvToBean<SaleModel> csvToBean = new CsvToBeanBuilder<SaleModel>(reader)
                    .withType(SaleModel.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Stream<SaleModel> stream = StreamSupport.stream(csvToBean.spliterator(), false);

            return Flux.fromStream(stream);
        } catch (Exception e) {
            return Flux.error(new RuntimeException("Error reading CSV file: " + e.getMessage()));
        }
    }

   public List<SaleDTO> readSaleData() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource(trainingDataset);

        try (FileReader reader = new FileReader(classPathResource.getFile())) {
            CsvToBean<SaleModel> csvToBean = new CsvToBeanBuilder<SaleModel>(reader)
                    .withType(SaleModel.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.parse().stream().map(this::convertToDTO).toList();
        }
    }

    public Page<SaleDTO> readPagedSaleData(Pageable pageable) throws IOException {
        List<SaleDTO> saleDTOS = readSaleData();

        if(pageable.getPageNumber() < 1) {
            pageable.setPageNumber(1);
        }

        if(pageable.getPageSize() < 1 ) {
            pageable.setPageSize(10);
        }

        pageable.setTotalPages(saleDTOS.size() / pageable.getPageSize());

        int startIndex = (pageable.getPageNumber() -1) * pageable.getPageSize();
        int endIndex = Math.min(startIndex + pageable.getPageSize(), saleDTOS.size());
        List<SaleDTO> filteredSaleDTO = IntStream.range(startIndex, endIndex).mapToObj(saleDTOS::get).toList();
        return new Page<>(filteredSaleDTO, pageable);
    }

    private SaleDTO convertToDTO(SaleModel saleModel) {
        return modelMapper.map(saleModel, SaleDTO.class);
    }
}
