package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getdata/")
@SessionAttributes("user")
public class AuthorizationController {
    @ModelAttribute("user")
    public User createUser() {
        return new User();
    }

//    @PostMapping("/login")
//    public boolean checkLogin(@RequestBody User user, Model model) {
//        User userCheck = createUser();
//        userCheck.setUsername(user.getUsername());
//        userCheck.setPassword(user.getPassword());
//        //to do something
//        model.addAttribute("user", userCheck);
//        return true;
//    }
//
//    @PostMapping("/register")
//    public boolean registerUser(@RequestBody User user) {
//        return true;
//    }
//
//    @GetMapping("/logout")
//    public void logout() {
//
//    }
//
//    @GetMapping("/testlogin")
//    public boolean testCheckLogin(@RequestParam String username, @RequestParam String password) {
//        return username.equalsIgnoreCase("tantt121") && password.equalsIgnoreCase("tantt121");
//    }
//
//    @PostMapping("/testregister")
//    public boolean testCheckRegister(@RequestBody UserDTO userDTO) {
//        return true;
//    }
}
