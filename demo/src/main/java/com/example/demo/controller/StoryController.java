package com.example.demo.controller;

import com.example.demo.model.Story;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/getdata")
public class StoryController {
    @GetMapping("/getliststory")
    public List<Story> getListStory(){
        return null;
    }
}
