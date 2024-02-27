package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo2-0.0.1-SNAPSHOT")
public class DemoController {

    @GetMapping("/demo")
    public String getDemo(){
        return "DEMO";
    }

}
