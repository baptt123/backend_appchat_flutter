package com.example.demo.websocket;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@RestController
public class TextDataHandler extends TextWebSocketHandler {
    @Autowired
    MessageRepository messageRepository;

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        //chức năng gửi tin nhắn
        session.getAttributes().get("senderid").toString();
        session.getAttributes().get("receiptid").toString();
        Message message1= (Message) message.getPayload();
        messageRepository.save(message1);
        session.sendMessage((WebSocketMessage<?>) message1);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Kết nối thành công");
    }
}

