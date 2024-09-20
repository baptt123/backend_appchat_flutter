package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getdata")
public class ReactController {
    //chức năng thêm cảm xúc
    @PostMapping("/addreact")
    public String addReact() {
        return "success";
    }

    //chức năng chuyển đổi biểu tượng cảm xúc
    @PutMapping("/updatereact")
    public String updateReact() {
        return "success";
    }
    //chức năng xóa biểu tượng cảm xúc
    @DeleteMapping("/deletereact")
    public String deleteReact() {
        return "success";
    }
}
