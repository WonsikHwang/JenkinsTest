package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String testController() {
        return "Jenkins Test";
    }
    @GetMapping("/test")
    public String testController2() {
        return "<h1>우리집에 왜 왔니</h1>";
    }

    @GetMapping("/test2")
    public String testController3() {
        return "<h1>우리집에 왜 왔니 왜 왔니</h1>";
    }
}
