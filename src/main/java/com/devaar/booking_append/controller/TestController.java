package com.devaar.booking_append.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("/h")
    public String sayhello() {
        return "Hello";
    }

    @GetMapping("/worked")
    public String worked() {
        return "Worked!";
    }
}
