package com.example.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders/getAllOrders")
    public List<String> getAllOrders() {
        List<String> orders = List.of("Order1", "Order2", "Order3");
        return orders;
    }
}
