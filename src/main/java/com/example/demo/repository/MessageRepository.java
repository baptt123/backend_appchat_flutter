package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MessageRepository extends MongoRepository<Message, Integer> {
   @Query("")
    List<Message> findAll();
}
