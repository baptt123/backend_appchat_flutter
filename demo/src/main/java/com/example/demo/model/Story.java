package com.example.demo.model;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Story {
    private String contentBinary;

    public static void main(String[] args) {
        Story test=new Story();
        Story story=builder().contentBinary(test.getContentBinary()).build();
    }
}
