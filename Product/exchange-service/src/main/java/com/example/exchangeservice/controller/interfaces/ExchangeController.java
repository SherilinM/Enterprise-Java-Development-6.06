package com.example.exchangeservice.controller.interfaces;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Optional;

public interface ExchangeController {
    BigDecimal getPriceInCurrency(Optional<BigDecimal> price, Optional<String> currency);
}
