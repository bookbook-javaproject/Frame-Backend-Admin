package com.frame.admin.domain.post.service;

import com.frame.admin.domain.post.domain.dto.DeletePostRequest;
import com.frame.admin.domain.post.domain.usecase.DeletePostUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    
    private final DeletePostUseCase deletePostUseCase;

    @Override
    public void deletePost(DeletePostRequest request) {
        deletePostUseCase.execute(request.getPostId());
    }
}
