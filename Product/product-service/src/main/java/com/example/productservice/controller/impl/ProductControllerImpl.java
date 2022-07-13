package com.example.productservice.controller.impl;

import com.example.productservice.controller.interfaces.ProductController;
import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product-price/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product getProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "NOT FOUND"));
        return product;
    }
}
