package com.example.demo.model;

import com.example.demo.dto.CommentDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RequestPostMapper {
    private Post post;
    private CommentDTO commentDTO;
}
