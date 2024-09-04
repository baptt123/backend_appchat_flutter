package com.example.demo.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDTO implements Serializable {
    private int id;
    private String title;
    private String content;

}
