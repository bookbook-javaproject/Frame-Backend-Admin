package com.frame.admin.domain.post.controller;

import com.frame.admin.domain.post.domain.dto.DeletePostRequest;
import com.frame.admin.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deletePost(@RequestBody DeletePostRequest request) {
        postService.deletePost(request);
    }
}
