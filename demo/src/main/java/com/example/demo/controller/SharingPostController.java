package com.example.demo.controller;

import com.example.demo.model.SharedPost;
import com.example.demo.repository.SharingPostRepositoryMongoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/getdata")
public class SharingPostController {
    @Autowired
    private SharingPostRepositoryMongoDB sharingPostRepository;

    @PostMapping("/insertsharedpost")
    public void insertSharedPost(@RequestBody SharedPost sharedPost) {
        sharingPostRepository.save(sharedPost);
    }

    @GetMapping("/getsharedpostbyname")
    public List<SharedPost> getSharedPostByName(@RequestParam String name) {
        return sharingPostRepository.findBySharingName(name);
    }
}
