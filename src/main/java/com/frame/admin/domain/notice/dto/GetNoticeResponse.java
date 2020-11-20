package com.frame.admin.domain.notice.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class GetNoticeResponse {
    private List<NoticePreview> notices;
}
