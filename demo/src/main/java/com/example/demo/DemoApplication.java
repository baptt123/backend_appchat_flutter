package com.example.demo;

import com.example.demo.controller.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
	}

}
