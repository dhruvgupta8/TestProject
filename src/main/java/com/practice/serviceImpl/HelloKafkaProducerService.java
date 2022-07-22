package com.practice.serviceImpl;

import com.practice.service.KafkaProducerService;
import com.practice.service.KakfaProducerClient;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.Prototype;

@Prototype
public class HelloKafkaProducerService implements KafkaProducerService {

    private final KakfaProducerClient kakfaProducerClient = ApplicationContext.run().getBean(KakfaProducerClient.class);

    private void sendMessage(String topic, String key, String data) {
        kakfaProducerClient.sendProduct(topic, key, data);
    }

    @Override
    public String sendData() {
        sendMessage("Hello", "world", "Hello World 1001");
        return null;
    }
}