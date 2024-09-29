package com.example.demo.controller;

import com.example.demo.dto.CommentDTO;
import com.example.demo.dto.PostDTO;
import com.example.demo.model.Comment;
import com.example.demo.model.Post;
import com.example.demo.model.RequestPostMapper;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/getdata/")
public class PostController {
    @Autowired
    PostRepository postRepository;
    @Autowired
    CommentRepository commentRepository;
    @GetMapping("/getposts")
    //chức năng hiển thị danh sách bài viết
    public List<PostDTO> getPosts() {
        List<Post> lists = postRepository.getPosts();
        List<PostDTO> dtos = new ArrayList<>();
        for (Post post : lists) {
            PostDTO dto = PostDTO.builder().id(post.getId()).title(post.getTitle()).content(post.getContent()).build();
            dtos.add(dto);
        }
        return dtos;
    }

    //chức năng thêm bài viết
    @PostMapping("/addpost")
    public String addPost(@RequestBody Post post) {
        postRepository.save(post);
        return "success";
    }

    @PutMapping("/updatereact")
    public void updatePost(@RequestBody Post post) {
        postRepository.updatePost(post.getId());
    }
    @PostMapping("/addcomment")
    public void addComment(@RequestBody RequestPostMapper requestPostMapper) {
        commentRepository.insertComment(requestPostMapper.getCommentDTO().getId(),requestPostMapper.getCommentDTO().getComment(),requestPostMapper.getPost().getId());
    }
}
