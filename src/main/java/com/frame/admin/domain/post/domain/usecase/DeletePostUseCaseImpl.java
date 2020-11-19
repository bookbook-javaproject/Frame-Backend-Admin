package com.frame.admin.domain.post.domain.usecase;

import com.frame.admin.domain.post.domain.repository.PostRepository;
import com.frame.admin.global.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeletePostUseCaseImpl implements DeletePostUseCase {

    private final PostRepository postRepository;

    @Override
    public void execute(Long postId) {
        postRepository.findById(postId).orElseThrow(NotFoundException::new);
        postRepository.deleteById(postId);
    }
}
