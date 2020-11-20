package com.frame.admin.domain.notice.service;

import com.frame.admin.domain.notice.domain.entity.Notice;
import com.frame.admin.domain.notice.domain.usecase.CreateNoticeUseCase;
import com.frame.admin.domain.notice.domain.usecase.GetNoticeUseCase;
import com.frame.admin.domain.notice.dto.CreateNoticeRequest;
import com.frame.admin.domain.notice.dto.GetNoticeResponse;
import com.frame.admin.domain.notice.dto.NoticePreview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {
    private final CreateNoticeUseCase createNoticeUseCase;
    private final GetNoticeUseCase getNoticeUseCase;

    @Override
    public GetNoticeResponse getNotice() {
        List<NoticePreview> noticePreviews = new ArrayList<>();
        for (Notice notice: getNoticeUseCase.execute()) {
            noticePreviews.add(NoticePreview.builder()
                    .title(notice.getTitle())
                    .content(notice.getContent())
                    .createdAt(notice.getCreatedAt())
                    .build());
        }
        return GetNoticeResponse.builder().notices(noticePreviews).build();
    }

    @Override
    public void createNotice(CreateNoticeRequest request) {
        createNoticeUseCase.execute(
                request.getTitle(),
                request.getContent()
        );
    }
}
