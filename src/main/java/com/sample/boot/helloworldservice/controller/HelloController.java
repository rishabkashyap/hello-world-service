package com.sample.boot.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
public class HelloController {
    @GetMapping("/test")
    public String hello() {
        return "Hello World from ECS 🚀";
    }
}
