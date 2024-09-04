//package com.example.demo.service;
//
//import com.example.demo.model.User;
//import com.example.demo.repository.UserRepository;
//import com.example.demo.userdetail.CustomUserDetail;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//    public CustomUserDetail getUserDetails(String username) {
//        User user=userRepository.findByUsername(username);
//        if(user==null){
//            throw new UsernameNotFoundException(username);
//        }
//        return new CustomUserDetail(user);
//    }
//}
