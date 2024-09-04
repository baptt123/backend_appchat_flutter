package com.example.demo.repository;

import com.example.demo.dto.PostDTO;
import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
   @Query(value= "select post.id,post.title,post.content,post.user_id from post join user on post.user_id=user.id",nativeQuery = true)
  public  List<Post> getPosts();
}
