package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.exception.JWTException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JWTUtils;
import com.example.demo.service.UserService;
import jakarta.servlet.http.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/api/getdata/")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    JWTUtils jwtUtils;
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity checkLogin(@RequestBody Map<String, Object> dataList) throws Exception {
        return userService.checkLogin(dataList);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) throws Exception {
        Optional<String> otpName = Optional.of(user.getUsername());
        Optional<String> otpUserName = Optional.of(user.getUsername());
        Optional<String> otpPassword = Optional.of(user.getPassword());
        Optional<String> otpEmail = Optional.of(user.getEmail());
        Optional<Timestamp> otpBirthday = Optional.of(user.getBirthday());
        if (otpName.isPresent() && userRepository.findNameByUsername(user.getUsername()) != null) {
            if (otpUserName.isPresent() && userRepository.findUsernameByUsername(user.getUsername()) != null) {
                if (otpPassword.isPresent() && user.getPassword().length() < 10) {
                    if (otpEmail.isPresent()) {
                        if (otpBirthday.isPresent()) {
                            userRepository.save(user);
                            return ResponseEntity.ok("Đã tạo tài khoản thành công");
                        }
                    }
                }
            }
        }
        return ResponseEntity.notFound().build();

    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateprofile")
    public ResponseEntity<String> updateProfile(@RequestBody User user) throws Exception {
        userRepository.saveAndFlush(user);
        return ResponseEntity.ok("Success");
    }
}
