package com.tgc.rea.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@Slf4j
public class RealEstateDataController {

    @GetMapping(value = "/real-estate-data", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> readRealEstateData() {
        log.info("Retrieving real-estate-data");
        return Flux.just();
    }
}
