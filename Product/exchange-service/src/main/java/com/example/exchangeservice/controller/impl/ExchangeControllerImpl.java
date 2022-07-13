package com.example.exchangeservice.controller.impl;

import com.example.exchangeservice.controller.interfaces.ExchangeController;
import com.example.exchangeservice.enums.Currency;
import com.example.exchangeservice.service.interfaces.ExchangeService;
import com.thoughtworks.xstream.converters.extended.CurrencyConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

@RestController
public class ExchangeControllerImpl implements ExchangeController {
    @Autowired
    private ExchangeService exchangeService;

    @GetMapping("/prices")
    @ResponseStatus(HttpStatus.OK)
    public BigDecimal getPriceInCurrency(@RequestParam Optional<BigDecimal> price,
                                         @RequestParam Optional<String> currency) {
        if (!price.isPresent() || !currency.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return exchangeService.getPriceInCurrency(price.get(),currency.get());
    }
}
