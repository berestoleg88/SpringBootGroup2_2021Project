package com.example.springboot.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NASDAQService implements StockService {
    @Override
    public String getId() {
        return "NASDAQ";
    }

    @Override
    public float getExchangeRate(String stockId, LocalDateTime time) {
        System.out.println("NASDAQ rate for: " + stockId + " at " + time);
        return 20;
    }
}
