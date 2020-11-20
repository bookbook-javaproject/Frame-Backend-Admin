package com.frame.admin.domain.notice.service;

import com.frame.admin.domain.notice.dto.CreateNoticeRequest;
import com.frame.admin.domain.notice.dto.GetNoticeResponse;

public interface NoticeService {
    public GetNoticeResponse getNotice();

    public void createNotice(CreateNoticeRequest request);
}
