package com.example.demo.dto;

import lombok.*;

import java.io.Serializable;
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String comment;
    private int post_id;
}
