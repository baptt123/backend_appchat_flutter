package com.example.demo.controller;

import com.example.demo.dto.PostDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.exception.JWTException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JWTUtils;
import jakarta.servlet.http.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/getdata/")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    JWTUtils jwtUtils;

    @PostMapping("/login")
    public boolean checkLogin(@RequestBody String username, String password, @CookieValue(value = "jwt", defaultValue = "not storing jwt") String cookie) throws Exception {
        User user = userRepository.findByUsername(username, password);
        UserDTO userDTO;

        if (user != null) {
            userDTO = UserDTO.builder().username(user.getUsername()).password(user.getPassword()).build();
            if (cookie.equals("not storing jwt")) {
                String jwToken = jwtUtils.generateJwt(user);
                Cookie jwtCookie = new Cookie("jwt", jwToken);
            } else {
                try {
                    jwtUtils.generateJwt(user);
                    jwtUtils.verify(cookie);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            throw new JWTException();
        }


        return true;
    }
}
