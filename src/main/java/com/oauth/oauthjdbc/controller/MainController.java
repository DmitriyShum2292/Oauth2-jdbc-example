package com.oauth.oauthjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping
    public String helloWorld(){
        return "Hello World!";
    }
    @GetMapping("/oauth")
    public String ouauth(){
        return "oauth works";
    }
}
