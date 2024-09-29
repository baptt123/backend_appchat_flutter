package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL, optional = false, mappedBy = "post")
    private ListComment listComment;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Group group;
    private boolean reacted;
}
