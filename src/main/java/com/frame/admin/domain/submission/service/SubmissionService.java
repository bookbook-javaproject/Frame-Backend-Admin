package com.frame.admin.domain.submission.service;

import com.frame.admin.domain.submission.dto.ConfirmAuthorSubmissionRequest;
import com.frame.admin.domain.submission.dto.GetAuthorSubmissionsResponse;

public interface SubmissionService {
    public GetAuthorSubmissionsResponse getAuthorSubmissions();

    public void confirmAuthorSubmission(ConfirmAuthorSubmissionRequest request);
}
