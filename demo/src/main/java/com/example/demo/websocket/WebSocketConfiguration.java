package com.example.demo.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfiguration implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(getTextDataHandler(), "/api/getdata/sendtextmessage");
        registry.addHandler(getBinaryDataHandler(), "/api/getdata/sendbinarymessage");
    }

    @Bean
    public TextDataHandler getTextDataHandler() {
        return new TextDataHandler();
    }

    @Bean
    public BinaryDataHandler getBinaryDataHandler() {
        return new BinaryDataHandler();
    }
}
