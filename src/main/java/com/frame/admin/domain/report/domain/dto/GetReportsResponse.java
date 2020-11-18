package com.frame.admin.domain.report.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GetReportsResponse {
    private Long reportId;

    private String content;

    private Long reportCount;

    private String writer;

    private String reporter;
}
