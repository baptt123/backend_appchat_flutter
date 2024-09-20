package com.example.demo.controller;

import com.example.demo.model.Story;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/getdata")
public class StoryController {
    //chức năng hiển thị danh sách story
    @GetMapping("/getliststory")
    public List<Story> getListStory(){
        return null;
    }
    //chức năng tạo story
    @PostMapping("/addstory")
    public void insertStory(@RequestBody Story story){

    }
 }
