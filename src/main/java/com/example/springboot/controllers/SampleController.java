package com.example.springboot.controllers;

import com.example.springboot.services.NASDAQService;
import com.example.springboot.services.NYSEService;
import com.example.springboot.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.ExecutorCompletionService;

@RequestMapping("/samplecontroller")
@RestController
public class SampleController {

    private final List<StockService> stockServiceList;

    public SampleController(List<StockService> stockServiceList) {
        this.stockServiceList = stockServiceList;
    }

    @RequestMapping("/test")
    public ResponseEntity<?> test(@RequestParam(value = "stockId", defaultValue = "GGL") String stockId) {
        //Future, ExecutorCompletionService




        float avg = 0.0f;
        for (StockService service: stockServiceList) {
            avg += service.getExchangeRate("Apple", LocalDateTime.now());
        }
        return ResponseEntity.ok("Avg Rate for " + stockId + " is " + avg/ stockServiceList.size());
    }
}


