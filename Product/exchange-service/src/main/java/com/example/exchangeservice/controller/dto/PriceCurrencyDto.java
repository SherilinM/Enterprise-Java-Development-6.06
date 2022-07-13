package com.example.exchangeservice.controller.dto;

import com.example.exchangeservice.enums.Currency;

import java.math.BigDecimal;

public class PriceCurrencyDto {
    private BigDecimal price;
    private Currency currency;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
