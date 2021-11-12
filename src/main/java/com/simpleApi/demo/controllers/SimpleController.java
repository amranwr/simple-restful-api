package com.simpleApi.demo.controllers;

import com.simpleApi.demo.models.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/")
    public Car getCar(){
        Car car = new Car(1,"amr","anwr");
        return car;
    }
}
