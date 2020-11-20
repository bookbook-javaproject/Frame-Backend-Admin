package com.frame.admin.domain.submission.domain.usecase;

import com.frame.admin.domain.submission.domain.entity.AuthorSubmission;
import com.frame.admin.domain.submission.domain.repository.AuthorSubmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAuthorSubmissionsUseCaseImpl implements GetAuthorSubmissionsUseCase {
    private final AuthorSubmissionRepository authorSubmissionRepository;

    @Override
    public Iterable<AuthorSubmission> execute() {
        return authorSubmissionRepository.findAll();
    }
}
