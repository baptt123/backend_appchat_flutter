package com.example.demo.repository;

import com.example.demo.dto.PostDTO;
import com.example.demo.model.Post;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select username,password from user where username=:username and password=:password",nativeQuery = true)
     User findByUsername(@Param("username")String username,@Param("password") String password);
}

