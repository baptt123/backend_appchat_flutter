package com.example.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "like_mongo_db")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//model này dùng cho việc thêm người dùng đã like bài viết và lưu vào mongo
public class LikeMongoDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //id bài viết
    private int postID;
    //tên người dùng đã like bài viết
    private List<String> userName;
}
