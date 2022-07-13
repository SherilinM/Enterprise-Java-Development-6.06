package com.example.edgeservice.controller.interfaces;

import com.example.edgeservice.dto.ProductDto;

import java.util.Optional;

public interface EdgeController {
    ProductDto getProductPrice(Long id, Optional<String> currency);
}
