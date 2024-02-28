package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

    @GetMapping("/demo2")
    public String getDemo(){
        System.out.println("inside getDemo method");
        return "DEMO";
    }

}
