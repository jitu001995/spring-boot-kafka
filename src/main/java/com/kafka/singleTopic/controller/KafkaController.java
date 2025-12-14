package com.kafka.singleTopic.controller;

import com.kafka.singleTopic.producer.SingleKafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SingleKafkaController {

    private final SingleKafkaProducerService producerService;

    public SingleKafkaController(SingleKafkaProducerService producerService) {

        this.producerService = producerService;
    }

    @GetMapping("/sends")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage("test-topic", message);
        return "Message sent: " + message;
    }
}