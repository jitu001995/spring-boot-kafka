package com.kafka.MultipleTopic.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

//@Service
public class KafkaConsumerService {

   // @KafkaListener(topics = "orders-created", groupId="order-group")
    public void consumeOrder(String message){
        System.out.println("[OrderConsumer] Received : "+message);
    }

    @KafkaListener(topics="payments-processed", groupId="payment-group")
    public void consumePayments(String message){
        System.out.println("[Payment Consumer ] Received : "+message);
    }
}
