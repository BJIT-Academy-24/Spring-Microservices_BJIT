package com.example.order_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    public String getProductDetails(String productId) {
        String productServiceUrl = "http://localhost:8081/products/" + productId;
        return restTemplate.getForObject(productServiceUrl, String.class);
    }
}
