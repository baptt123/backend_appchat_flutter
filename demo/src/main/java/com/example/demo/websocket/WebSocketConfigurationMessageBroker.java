package com.example.demo.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

//@Configuration
//@EnableWebSocketMessageBroker
public class WebSocketConfigurationMessageBroker implements WebSocketMessageBrokerConfigurer {
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        registry.addEndpoint("/ws").setAllowedOrigins("*");
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.enableSimpleBroker("/topic");//tù server gửi về lại client
//        registry.setApplicationDestinationPrefixes("/app");//từ client gửi xuống server
//        registry.setUserDestinationPrefix("/topic");
//        registry.configureBrokerChannel();
//        registry.enableSimpleBroker("/app");
//    }

}
