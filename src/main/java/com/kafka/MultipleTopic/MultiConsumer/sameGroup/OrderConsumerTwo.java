package com.kafka.MultipleTopic.MultiConsumer.sameGroup;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerTwo {

    @KafkaListener(topics="orders-created",groupId="order-processing-group")
    public void consume2(String message){
        System.out.println("[Consumer-2] received :: "+message);
    }
}
