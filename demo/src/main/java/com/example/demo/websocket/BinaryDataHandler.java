package com.example.demo.websocket;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.BinaryWebSocketHandler;

public class BinaryDataHandler extends BinaryWebSocketHandler {
    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
      byte[] data=message.getPayload().array();
      session.sendMessage(new BinaryMessage(data));
    }
}
