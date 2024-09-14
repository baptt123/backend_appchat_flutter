package com.example.demo.repository;

import com.example.demo.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
    public Group findByName(String name);
//    @Modifying
//    @Transactional
//    @Query(value = "insert into group(name,quantity) values(:name ,:quantity)",nativeQuery = true)
//    public void insertGroup(@Param("name")String name,@Param("quantity") int quantity);
}
