package com.frame.admin.domain.submission.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class GetAuthorSubmissionsResponse {
    private List<AuthorSubmissionPreview> authorSubmissionPreviews;
}
