package com.lpl.springcloud.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping("/provider")
    public String provider() {
        return "Hello,Provider3!";
    }
}
