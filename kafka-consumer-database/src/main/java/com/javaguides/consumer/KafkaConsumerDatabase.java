package com.javaguides.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {
    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerDatabase.class.getSimpleName());

    @KafkaListener(topics = "wikimedia_javaguides", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Event message received -> %s", message));
    }
}
