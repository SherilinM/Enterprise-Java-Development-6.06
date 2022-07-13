package com.example.exchangeservice.service.impl;

import com.example.exchangeservice.service.interfaces.ExchangeService;
import com.example.exchangeservice.enums.Currency;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    public BigDecimal getPriceInCurrency(BigDecimal price, String currency) {
        Currency currencyEnum;
        BigDecimal newPrice = BigDecimal.ONE;
        try {
            currencyEnum = Currency.valueOf(currency);
        } catch (Exception e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        switch (currencyEnum){
            case GBP:
                newPrice = price.multiply(BigDecimal.valueOf(0.84)).setScale(2, RoundingMode.HALF_EVEN);
                break;
            case EUR:
                newPrice = price.multiply(BigDecimal.valueOf(0.98)).setScale(2, RoundingMode.HALF_EVEN);
                break;
        }

        return newPrice;
    }
}
