package com.vinsguru.aggregator.dto;

import com.vinsguru.aggregator.domain.Ticker;

import java.time.LocalDateTime;

public record StockPriceResponse(Ticker ticker,
                                 Integer price) {
}
