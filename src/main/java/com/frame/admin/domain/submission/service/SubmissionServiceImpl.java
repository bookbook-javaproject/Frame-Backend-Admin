package com.frame.admin.domain.submission.service;

import com.frame.admin.domain.submission.domain.entity.AuthorSubmission;
import com.frame.admin.domain.submission.domain.usecase.ConfirmAuthorSubmissionUseCase;
import com.frame.admin.domain.submission.domain.usecase.GetAuthorSubmissionsUseCase;
import com.frame.admin.domain.submission.dto.AuthorSubmissionPreview;
import com.frame.admin.domain.submission.dto.ConfirmAuthorSubmissionRequest;
import com.frame.admin.domain.submission.dto.GetAuthorSubmissionsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SubmissionServiceImpl implements SubmissionService {
    private final GetAuthorSubmissionsUseCase getAuthorSubmissionsUseCase;
    private final ConfirmAuthorSubmissionUseCase confirmAuthorSubmissionUseCase;

    @Override
    public GetAuthorSubmissionsResponse getAuthorSubmissions() {
        List<AuthorSubmissionPreview> authorSubmissionPreviews = new ArrayList<AuthorSubmissionPreview>();
        for (AuthorSubmission authorSubmission: getAuthorSubmissionsUseCase.execute()) {
            authorSubmissionPreviews.add(
                    AuthorSubmissionPreview.builder()
                            .email(authorSubmission.getEmail())
                            .goal(authorSubmission.getGoal())
                            .link(authorSubmission.getLink())
                            .build()
            );
        }

        return GetAuthorSubmissionsResponse.builder()
                .authorSubmissionPreviews(authorSubmissionPreviews).build();
    }

    @Override
    public void confirmAuthorSubmission(ConfirmAuthorSubmissionRequest request) {
        confirmAuthorSubmissionUseCase.execute(request.getEmail(), request.getConfirm());
    }
}
