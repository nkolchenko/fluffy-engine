package com.fluffyengine.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {
    @GetMapping("/health")
    public String healthCheck() {
        return "healthy";
    }

    @GetMapping("/result")
    public String result() {
        return new Random().nextBoolean() ? "HeHe" : "Not HeHe";
    }
}
