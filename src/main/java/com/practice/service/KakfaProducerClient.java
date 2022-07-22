package com.practice.service;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface KakfaProducerClient {

    void sendProduct(@Topic String topic, @KafkaKey String brand, String name);
}
