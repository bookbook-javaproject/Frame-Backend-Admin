package com.frame.admin.domain.submission.domain.usecase;


import com.frame.admin.domain.submission.domain.entity.AuthorSubmission;
import com.frame.admin.domain.submission.domain.repository.AuthorSubmissionRepository;
import com.frame.admin.domain.submission.domain.repository.UserRepository;
import com.frame.admin.global.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ConfirmAuthorSubmissionUseCaseImpl implements ConfirmAuthorSubmissionUseCase {
    private final AuthorSubmissionRepository authorSubmissionRepository;
    private final UserRepository userRepository;

    @Override
    public void execute(String email, Boolean confirm) {
        Optional<AuthorSubmission> optionalAuthorSubmission = authorSubmissionRepository.findById(email);
        optionalAuthorSubmission.orElseThrow(NotFoundException::new);
        optionalAuthorSubmission.ifPresent(
            authorSubmission -> {
                userRepository.findById(email).ifPresent(
                    user -> {
                        if (confirm.equals(true)) user.changeToAuthor();
                        userRepository.save(user);
                    }
                );

                authorSubmissionRepository.delete(authorSubmission);
            }
        );
    }
}
