package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name="user_id",nullable = false)
    private User user;
}
