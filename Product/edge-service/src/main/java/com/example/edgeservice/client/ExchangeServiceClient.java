package com.example.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.Optional;

@FeignClient("exchange-service")
public interface ExchangeServiceClient {
    @GetMapping("/prices")
    BigDecimal getPriceInCurrency(@RequestParam BigDecimal price, @RequestParam String currency);
}
