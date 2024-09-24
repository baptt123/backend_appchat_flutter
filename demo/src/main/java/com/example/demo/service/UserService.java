package com.example.demo.service;


import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.JWTUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private JWTUtils jwtUtils;

    public ResponseEntity checkLogin(Map<String, Object> dataList) throws Exception {
        String userName = objectMapper.convertValue(dataList.get("username"), String.class);
        String passWord = objectMapper.convertValue(dataList.get("password"), String.class);
        String jwt = objectMapper.convertValue(dataList.get("jwt_user"), String.class);

        //trường hợp  đăng nhập lần đầu
        if (userRepository.findByUsername(userName, passWord) != null) {
            UserDTO userDTO = UserDTO.builder().username(userName).password(passWord).build();
            jwtUtils.generateJwt(userDTO);
            return ResponseEntity.ok("Đăng nhập thành công ");
            //trường hợp đăng nhập ở những lần sau
        }
        Optional<Claims> claims = Optional.of(jwtUtils.verify(jwt));
        if (claims.isPresent()) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
