package com.frame.admin.domain.submission.domain.usecase;

import com.frame.admin.domain.submission.domain.entity.AuthorSubmission;

import java.util.List;

public interface GetAuthorSubmissionsUseCase {
    public Iterable<AuthorSubmission> execute();
}
