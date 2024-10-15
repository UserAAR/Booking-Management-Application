package com.devaar.booking_append.controller;

import com.devaar.booking_append.config.MyConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.GenericArrayType;

@RestController
public class MyConfigController {
    private final MyConfigProperties myConfigProperties;

    public MyConfigController(MyConfigProperties myConfigProperties) {
        this.myConfigProperties = myConfigProperties;
    }

    @GetMapping("/getTest")
    public String getTestConfig() {
        return "Username: " + myConfigProperties.getUsername() + ", " +
                "Password: " + myConfigProperties.getPassword() + ", " +
                "Duration: " + myConfigProperties.getDuration();
    }
}
