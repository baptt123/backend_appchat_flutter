package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    //gán id tự động tăng
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String password;
    private String email;
    private Timestamp birthday;
    private int post_id;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

}
