package com.example.order_service.controller;

import com.example.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{productId}")
    public String getOrderDetails(@PathVariable String productId) {
        return orderService.getProductDetails(productId);
    }

    @GetMapping("/orders/getAllOrders")
    public List<String> getAllOrders() {
        List<String> orders = List.of("Order1", "Order2", "Order3");
        return orders;
    }
}
