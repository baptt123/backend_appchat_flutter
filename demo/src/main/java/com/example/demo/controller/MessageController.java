package com.example.demo.controller;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
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
    @MessageMapping("/chat")//gửi dữ liệu từ client xuống server thông qua websocket
    @SendTo("topic/message")//gửi dữ liệu từ server lên client qua websocket
    public Message sendMessage(@Payload Message message) { //Payload dùng để lấy dữ liệu được gửi từ client xuống server
        //hàm này của messageRepository dùng để lưu trữ dữ liệu xuống db
         messageRepository.save(message);
         //gửi dữ liệu dạng chuỗi thông qua object message
         return message;
    }
}
