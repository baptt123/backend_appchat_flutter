package com.example.demo.controller;

import com.example.demo.dto.PostDTO;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/getdata/")
public class UserController {
    @Autowired
    UserRepository userRepository;


}
