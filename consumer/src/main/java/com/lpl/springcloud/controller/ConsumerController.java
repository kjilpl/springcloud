package com.lpl.springcloud.controller;

import com.lpl.springcloud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
//    @Autowired
//    RestTemplate restTemplate;
    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/consumer")
    public String consumer(){
//        return "test...";
//        return restTemplate.getForObject("http://PROVIDER/provider",String.class);
        return consumerService.getProvider();
    }
}
