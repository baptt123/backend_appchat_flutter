package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/getdata/")
public class PostController {
    @Autowired
    PostRepository postRepository;

    @GetMapping("/getpost")
    public List<Post> getListPost() {
        return postRepository.findAll();
    }
}
