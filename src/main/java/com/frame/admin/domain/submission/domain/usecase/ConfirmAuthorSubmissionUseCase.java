package com.frame.admin.domain.submission.domain.usecase;

public interface ConfirmAuthorSubmissionUseCase {
    public void execute(String email, Boolean confirm);
}
