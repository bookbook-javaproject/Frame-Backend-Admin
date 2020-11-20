package com.frame.admin.domain.submission.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AuthorSubmissionPreview {
    private String email;

    private String link;

    private String goal;
}
