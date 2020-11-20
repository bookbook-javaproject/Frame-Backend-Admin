package com.frame.admin.domain.notice.domain.usecase;

import com.frame.admin.domain.notice.domain.entity.Notice;
import com.frame.admin.domain.notice.domain.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetNoticeUseCaseImpl implements GetNoticeUseCase {
    private final NoticeRepository noticeRepository;

    @Override
    public Iterable<Notice> execute() {
        return noticeRepository.findAll();
    }
}
