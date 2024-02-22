package com.deloitte.app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/app1")
public class App1Controller {

    @GetMapping("/method1/{message}")
    public String method1(@PathVariable String message){
        return message;
    }

    @GetMapping("/callapp2")
    public String getFromAnotherApp(){
        String uri = "http://localhost:8081/v1/app2/method1";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }
}
