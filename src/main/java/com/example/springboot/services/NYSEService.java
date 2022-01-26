package com.example.springboot.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Qualifier("abc")
public class NYSEService implements StockService {
    @Override
    public String getId() {
        return "NYSE";
    }

    @Override
    public float getExchangeRate(String stockId, LocalDateTime time) {
        System.out.println("NYSE rate for: " + stockId + " at " + time);
        return 10;
    }
}
