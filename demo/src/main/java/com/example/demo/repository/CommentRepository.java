package com.example.demo.repository;

import com.example.demo.model.Comment;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {
@Modifying
    @Transactional
    @Query(value="insert into comment(id,content,post_id) values(:id,:content,:post_id)",nativeQuery = true)
    public void insertComment(@Param("id") int id, @Param("content") String content, @Param("post_id") int post_id);
}
