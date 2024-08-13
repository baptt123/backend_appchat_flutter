package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Entity
@Document("message")
public class Message {
    @Id
    private int id;
    private String message;

    public Message() {
    }

    public Message(int id, String message) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
