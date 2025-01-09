package com.tgc.rea.service;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.tgc.rea.dto.SaleDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class RealEstateDataService {
    @Value("${dataset.training}")
    private String trainingDataset;

    public Flux<SaleDTO> readSaleDataStream() {
        ClassPathResource classPathResource = new ClassPathResource(trainingDataset);

        try (FileReader reader = new FileReader(classPathResource.getFile())) {
            CsvToBean<SaleDTO> csvToBean = new CsvToBeanBuilder<SaleDTO>(reader)
                    .withType(SaleDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            Stream<SaleDTO> stream = StreamSupport.stream(csvToBean.spliterator(), false);

            return Flux.fromStream(stream);
        } catch (Exception e) {
            return Flux.error(new RuntimeException("Error reading CSV file: " + e.getMessage()));
        }
    }

    public List<SaleDTO> readSaleData() {
        ClassPathResource classPathResource = new ClassPathResource(trainingDataset);

        try (FileReader reader = new FileReader(classPathResource.getFile())) {
            CsvToBean<SaleDTO> csvToBean = new CsvToBeanBuilder<SaleDTO>(reader)
                    .withType(SaleDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
