package com.example.demo.controller;

import com.example.demo.model.SharedPost;
import com.example.demo.repository.SharingPostRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/getdata")
public class SharingPostController {
    @Autowired
    private SharingPostRepositoryMongoDB sharingPostRepository;

    @PostMapping("/insertsharedpost")
    public void insertSharedPost(@RequestBody SharedPost sharedPost) {
        sharingPostRepository.save(sharedPost);
    }
}
