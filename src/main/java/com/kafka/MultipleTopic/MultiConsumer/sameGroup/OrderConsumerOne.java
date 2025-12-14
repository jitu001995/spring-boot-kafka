package com.kafka.MultipleTopic.MultiConsumer.sameGroup;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerOne {

    @KafkaListener(topics="orders-created",groupId="order-processing-group")
    public void consume(String message){
        System.out.println("[Consumer-1] received :: "+message);
    }
}
