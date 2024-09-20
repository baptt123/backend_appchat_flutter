package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getdata")
public class CommentController {
    //chức năng thả cảm xúc
    @PostMapping("/addreact")
    public String addReact(){

        return "success";
    }
}
