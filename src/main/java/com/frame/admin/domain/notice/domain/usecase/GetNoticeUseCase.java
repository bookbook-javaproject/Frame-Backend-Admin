package com.frame.admin.domain.notice.domain.usecase;

import com.frame.admin.domain.notice.domain.entity.Notice;

import java.util.List;

public interface GetNoticeUseCase {
    public Iterable<Notice> execute();
}
