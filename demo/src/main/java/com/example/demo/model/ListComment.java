package com.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "list_comment")
public class ListComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(orphanRemoval = false, cascade = CascadeType.ALL, mappedBy = "listComment")
    private List<Comment> comments;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
}
