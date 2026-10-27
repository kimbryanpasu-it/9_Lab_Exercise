package com.csit321g2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/main")
public class HelloSpringBoot {

    @GetMapping("/print")
    public String print(){
        return "Hello, Kim Bryan E. Pasu-it!";
    }

}