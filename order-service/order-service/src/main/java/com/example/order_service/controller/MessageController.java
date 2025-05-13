package com.example.order_service.controller;

import com.example.order_service.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private KafkaProducerService kafkaProducer;

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam(value = "message", required = false, defaultValue = "Default Message") String message) {
        kafkaProducer.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }
}
