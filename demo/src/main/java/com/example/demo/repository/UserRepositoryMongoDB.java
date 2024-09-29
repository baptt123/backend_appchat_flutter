package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
@Repository
public interface UserRepositoryMongoDB extends MongoRepository<User, String> {
    @Override
    List<User> findAll();

    @Override
    <S extends User> S insert(S entity);
}
