package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sharedpost")
public class SharedPost {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    //tên người chia sẻ bải viết
    private String sharingName;
    private String content;

}
