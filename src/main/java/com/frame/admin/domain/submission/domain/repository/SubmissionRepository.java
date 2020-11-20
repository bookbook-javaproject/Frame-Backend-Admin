package com.frame.admin.domain.submission.domain.repository;

import com.frame.admin.domain.submission.domain.entity.Submission;
import org.springframework.data.repository.CrudRepository;

public interface SubmissionRepository extends CrudRepository<Submission, Long> {
}
