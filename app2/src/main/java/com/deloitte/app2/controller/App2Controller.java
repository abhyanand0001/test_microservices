package com.deloitte.app2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/app2")
public class App2Controller {

    @GetMapping("/method1")
    public String greeting(){
        return "Hi User";
    }

    @GetMapping("/method1/{message}")
    public String greeting_from_user(@PathVariable String message){
        return message;
    }
}
