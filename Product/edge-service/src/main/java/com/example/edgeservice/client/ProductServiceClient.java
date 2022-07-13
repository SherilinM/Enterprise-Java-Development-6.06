package com.example.edgeservice.client;

import com.example.edgeservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductServiceClient {
    @GetMapping("/product-price/{id}")
    ProductDto getProduct(@PathVariable Long id);
}
