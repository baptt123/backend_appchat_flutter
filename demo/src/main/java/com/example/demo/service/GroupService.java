package com.example.demo.service;

import com.example.demo.model.Group;
import com.example.demo.model.Post;
import com.example.demo.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public void addGroup(Group group) {
        if (group.getPosts() != null) {
            for (Post post : group.getPosts()) {
                post.setGroup(group);
            }
        }
        groupRepository.save(group);
    }
}
