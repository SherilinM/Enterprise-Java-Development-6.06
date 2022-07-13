package com.example.edgeservice.controller.impl;

import com.example.edgeservice.client.ExchangeServiceClient;
import com.example.edgeservice.client.ProductServiceClient;
import com.example.edgeservice.controller.interfaces.EdgeController;
import com.example.edgeservice.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
public class EdgeControllerImpl implements EdgeController {
    @Autowired
    private ExchangeServiceClient exchangeServiceClient;
    @Autowired
    private ProductServiceClient productServiceClient;

    @GetMapping("/products/{id}")
    public ProductDto getProductPrice(@PathVariable Long id, @RequestParam Optional<String> currency) {
        if (!currency.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        ProductDto product = productServiceClient.getProduct(id);
        BigDecimal newPrice = exchangeServiceClient.getPriceInCurrency(product.getPrice(), currency.get());
        product.setPrice(newPrice);
        return product;
    }
}
