package com.tgc.rea.controller;

import com.tgc.rea.dto.Page;
import com.tgc.rea.dto.Pageable;
import com.tgc.rea.dto.SaleDTO;
import com.tgc.rea.model.SaleModel;
import com.tgc.rea.service.RealEstateDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@Slf4j
public class RealEstateDataController {

    private final RealEstateDataService realEstateDataService;

    public RealEstateDataController(RealEstateDataService realEstateDataService) {
        this.realEstateDataService = realEstateDataService;
    }

    @GetMapping(value = "/real-estate-data-stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<SaleModel> readRealEstateDataStream() {
        log.info("Retrieving real-estate-data-stream");
        return realEstateDataService.readSaleDataStream();
    }

    @GetMapping(value = "/real-estate-data", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SaleDTO> readRealEstateData() throws IOException {
        log.info("Retrieving real-estate-data");
        return realEstateDataService.readSaleData();
    }

    @GetMapping(value = "/real-estate-page-data", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<SaleDTO> readRealEstatePageData(Pageable pageable) throws IOException {
        log.info("Retrieving real-estate-page-data");
        return realEstateDataService.readPagedSaleData(pageable);
    }
}
