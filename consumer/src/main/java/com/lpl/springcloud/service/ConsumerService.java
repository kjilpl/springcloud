package com.lpl.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="PROVIDER")
public interface ConsumerService {

    @GetMapping("/provider")
    public String getProvider();
}
