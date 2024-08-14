package com.example.demo;

import com.example.demo.repository.MessageRepository;
import com.example.demo.repository.PostRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        PostRepository postRepository =context.getBean(PostRepository.class);
//        System.out.println(postRepository.findAll().size());
        MessageRepository messageRepository=context.getBean(MessageRepository.class);
        System.out.println(messageRepository.findAll().size());
    }

}
