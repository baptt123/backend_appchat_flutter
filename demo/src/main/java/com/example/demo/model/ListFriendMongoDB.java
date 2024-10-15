package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "list_friend_db")
public class ListFriendMongoDB {
    @Id
    //id của người dùng
    private int id;
    //danh sách bạn bè:lưu tên tài khoản của người dùng
    private List<String> listFriends;
}
