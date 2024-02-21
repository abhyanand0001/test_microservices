package com.deloitte.app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app2")
public class App2Controller {

    @GetMapping("/method1")
    public String method1(){
        return "Method 1 from app2";
    }
}
