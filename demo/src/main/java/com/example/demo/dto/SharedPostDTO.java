package com.example.demo.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Builder
public class SharedPostDTO implements Serializable {
    private int id;
    private String sharingName;
    private String content;
}


