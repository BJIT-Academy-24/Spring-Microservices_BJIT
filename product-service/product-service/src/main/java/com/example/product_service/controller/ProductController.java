package com.example.product_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {

    private static final Map<String, String> productData = new HashMap<>();

    static {
        productData.put("1", "Product 1 Details");
        productData.put("2", "Product 2 Details");
        productData.put("3", "Product 3 Details");
    }

    @GetMapping("/products/getAllProducts")
    public Map<String, String> getAllProducts() {
        return productData;
    }

    @GetMapping("/products/{productId}")
    public String getProductById(@PathVariable String productId) {
        return productData.getOrDefault(productId, "Product not found");
    }
}
