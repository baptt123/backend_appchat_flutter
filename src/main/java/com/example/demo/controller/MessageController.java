package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/getdata/")
public class MessageController {
    @GetMapping("/getmessage")
    public String getMessage() {
        return "Hello World";
    }
}
