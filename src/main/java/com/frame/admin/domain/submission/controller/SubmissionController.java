package com.frame.admin.domain.submission.controller;

import com.frame.admin.domain.submission.dto.ConfirmAuthorSubmissionRequest;
import com.frame.admin.domain.submission.dto.GetAuthorSubmissionsResponse;
import com.frame.admin.domain.submission.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/submission")
public class SubmissionController {
    private final SubmissionService submissionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public GetAuthorSubmissionsResponse getAuthorSubmissions() {
        return submissionService.getAuthorSubmissions();
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.OK)
    public void confirmAuthorSubmission(@RequestBody @Valid ConfirmAuthorSubmissionRequest request) {
        submissionService.confirmAuthorSubmission(request);
    }
}
