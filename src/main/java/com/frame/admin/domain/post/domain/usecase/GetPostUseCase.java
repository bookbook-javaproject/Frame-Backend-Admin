package com.frame.admin.domain.post.domain.usecase;

import com.frame.admin.domain.post.domain.entity.Post.Post;

public interface GetPostUseCase {
    public Post execute(Long postId);
}
