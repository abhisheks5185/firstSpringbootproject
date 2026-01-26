package com.ab.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Api {
    @Autowired
    private Car car;
    @GetMapping("a")
    public String run(){
        return  car.fun();
    }

}
