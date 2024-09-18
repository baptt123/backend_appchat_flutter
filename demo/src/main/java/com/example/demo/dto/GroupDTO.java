package com.example.demo.dto;

import com.example.demo.model.Post;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupDTO implements Serializable {
    private int id;
    private String nameGroup;
    private int quantity;
    private List<Post> posts;
}

