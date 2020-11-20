package com.frame.admin.domain.submission.domain.usecase;


import com.frame.admin.domain.submission.domain.repository.AuthorSubmissionRepository;
import com.frame.admin.domain.submission.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConfirmAuthorSubmissionUseCaseImpl implements ConfirmAuthorSubmissionUseCase {
    private final AuthorSubmissionRepository authorSubmissionRepository;
    private final UserRepository userRepository;

    @Override
    public void execute(String email, Boolean confirm) {
        authorSubmissionRepository.findById(email).ifPresent(
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
