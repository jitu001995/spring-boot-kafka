package com.kafka.MultipleTopic.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

        @Bean
        public NewTopic ordersCreatedTopic() {
            return new NewTopic("orders-created", 3, (short) 1);
        }

        @Bean
       public NewTopic paymentProceedTopic(){
            return new NewTopic("payments-processed", 2, (short) 1);
        }

}
