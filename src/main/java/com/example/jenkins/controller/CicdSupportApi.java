package com.example.jenkins.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class CicdSupportApi {
    private final Environment env;

    @GetMapping("/status/profile")
    public String getProfileName() {
        return Arrays.stream(env.getActiveProfiles()).findFirst().orElse("");
    }
}
