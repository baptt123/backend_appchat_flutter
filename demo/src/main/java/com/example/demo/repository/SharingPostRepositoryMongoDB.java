package com.example.demo.repository;

import com.example.demo.model.SharedPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SharingPostRepositoryMongoDB extends MongoRepository<SharedPost,Integer> {
    @Query("{'sharingName': ?0}")
     List<SharedPost> findBySharingName(String sharingName);
}
