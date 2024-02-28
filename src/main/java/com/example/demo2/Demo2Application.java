package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/api/controller")
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		System.out.println("-------application started-------------------------");
	}

	@GetMapping("/demo")
	public String getDemo(){
		System.out.println("inside getDemo method");
		return "DEMO";
	}

}
