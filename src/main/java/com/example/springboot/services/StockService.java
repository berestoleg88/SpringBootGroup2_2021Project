package com.example.springboot.services;

import java.time.LocalDateTime;

public interface StockService {
    String getId();
    float getExchangeRate(String stockId, LocalDateTime time);
}
