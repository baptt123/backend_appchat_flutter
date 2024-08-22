package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/getdata/")
public class MessageController {
    @Autowired
    MessageRepository messageRepository;
    @GetMapping("/getmessage")
    public List<Message> getMessage() {
        return messageRepository.findAll();
    }
}
