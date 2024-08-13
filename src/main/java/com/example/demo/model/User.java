package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Entity()
@Table(name = "user")
public class User {
    @Id
    //gán id tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "user")
    List<Post> posts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
