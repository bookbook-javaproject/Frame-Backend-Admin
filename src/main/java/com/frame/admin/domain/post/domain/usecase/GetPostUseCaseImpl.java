package com.frame.admin.domain.post.domain.usecase;

import com.frame.admin.domain.post.domain.entity.Post.Post;
import com.frame.admin.domain.post.domain.repository.PostRepository;
import com.frame.admin.global.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetPostUseCaseImpl implements GetPostUseCase {
    private final PostRepository postRepository;

    @Override
    public Post execute(Long postId) {
        return postRepository.findById(postId).orElseThrow(NotFoundException::new);
    }
}
