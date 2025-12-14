package com.kafka.MultipleTopic.controller;

import com.kafka.MultipleTopic.producer.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService){
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public String send(@RequestParam String topic, @RequestParam String message){
        producerService.sendMessage(topic,message);
        return "message sent to topic : "+topic;
    }
}
