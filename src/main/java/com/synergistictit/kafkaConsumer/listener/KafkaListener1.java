package com.synergistictit.kafkaConsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener1 {


    @KafkaListener(topics = "inbound", groupId = "group1")
    public void listen(String message) {
        System.out.println("Received Messasge in group1: " + message);
    }
}
