package com.csit321g2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @RequestMapping("/app-error")
    public String handleError() {
        return "This is an error.";
    }
}