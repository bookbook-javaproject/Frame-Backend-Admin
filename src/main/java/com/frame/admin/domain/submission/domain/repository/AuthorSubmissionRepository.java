package com.frame.admin.domain.submission.domain.repository;

import com.frame.admin.domain.submission.domain.entity.AuthorSubmission;
import org.springframework.data.repository.CrudRepository;

public interface AuthorSubmissionRepository extends CrudRepository<AuthorSubmission, String> {
}
