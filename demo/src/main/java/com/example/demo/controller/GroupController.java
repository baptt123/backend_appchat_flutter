package com.example.demo.controller;

import com.example.demo.dto.GroupDTO;
import com.example.demo.model.Group;
import com.example.demo.repository.GroupRepository;
import com.example.demo.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getdata")
public class GroupController {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private GroupService groupService;
    //chức năng tìm kiếm nhóm theo tên
    @GetMapping("/getgroup")
    public Group getGroupByName(@RequestParam String name) {
        return groupRepository.findByName(name);
    }
    //chức năng tạo nhóm
    @PostMapping("/insertgroup")
    public void insertGroup(@RequestBody Group group) {
        groupRepository.save(group);
    }
}
