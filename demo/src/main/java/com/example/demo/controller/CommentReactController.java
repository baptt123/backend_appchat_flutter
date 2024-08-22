package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getdata")
public class CommentReactController {
    @PutMapping("/updatecomment/{comment}")
    public boolean updateComment(@PathVariable String comment) {
        return true;

    }

    @GetMapping("/updatereact/{reactstring}")
    public boolean updateReact(@PathVariable String reactstring) {
        return true;
    }
}
