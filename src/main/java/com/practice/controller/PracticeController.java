package com.practice.controller;

import com.practice.service.KafkaProducerService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Controller("/")
@Singleton
public class PracticeController {

    @Inject
    @Named("hello")
    private KafkaProducerService producerService;

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "Hello World";
    }

    @Get(value = "/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloWorld() {
        producerService.sendData();
        return "Hello World";
    }
}
