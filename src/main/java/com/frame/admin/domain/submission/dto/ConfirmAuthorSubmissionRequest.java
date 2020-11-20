package com.frame.admin.domain.submission.dto;

import lombok.Getter;

@Getter
public class ConfirmAuthorSubmissionRequest {
    private String email;

    private Boolean confirm;
}
