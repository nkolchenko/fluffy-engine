package com.fluffyengine.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainController {

    @Value("${app.version}")
    private String version;

    @GetMapping("/health")
    public String healthCheck() {
        return "healthy";
    }

    @GetMapping("/result")
    public String result() {
        return new Random().nextBoolean() ? "HeHe" : "Not HeHe";
    }

    @GetMapping("/")
    public String main() {
        return "{version: " + version + "}";
    }
}
