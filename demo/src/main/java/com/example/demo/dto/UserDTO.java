package com.example.demo.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private String name;
    private String username;
    private String password;
    private String birthday;
    private String email;
    private String phone;
}
