package com.frame.admin.domain.notice.domain.usecase;

import com.frame.admin.domain.notice.domain.entity.Notice;
import com.frame.admin.domain.notice.domain.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class CreateNoticeUseCaseImpl implements CreateNoticeUseCase {
    private final NoticeRepository noticeRepository;

    @Override
    public void execute(String title, String content) {
        noticeRepository.save(
                Notice.builder()
                .title(title)
                .content(content)
                .createdAt(LocalDateTime.now())
                .build()
        );
    }
}
