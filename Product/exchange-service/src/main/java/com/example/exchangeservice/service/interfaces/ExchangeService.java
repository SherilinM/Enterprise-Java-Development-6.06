package com.example.exchangeservice.service.interfaces;

import java.math.BigDecimal;
import java.util.Optional;

public interface ExchangeService {
    BigDecimal getPriceInCurrency(BigDecimal price, String currency);
}
