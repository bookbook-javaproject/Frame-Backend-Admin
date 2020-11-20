package com.frame.admin.domain.notice.service;

import com.frame.admin.domain.notice.domain.usecase.CreateNoticeUseCase;
import com.frame.admin.domain.notice.dto.CreateNoticeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {
    private final CreateNoticeUseCase createNoticeUseCase;

    @Override
    public void createNotice(CreateNoticeRequest request) {
        createNoticeUseCase.execute(
                request.getTitle(),
                request.getContent()
        );
    }
}
