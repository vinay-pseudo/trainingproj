package com.training;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
@RestController
public class Day4Application {
 
    public static void main(String[] args) {
        SpringApplication.run(Day4Application.class, args);
    }
 
    @GetMapping("/msg")
    public String getMessage() {
        return "Hello, Lord! This is a message from Spring Boot.";
    }
}