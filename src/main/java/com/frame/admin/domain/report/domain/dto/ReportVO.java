package com.frame.admin.domain.report.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ReportVO {
    private Long reportId;

    private String content;

    private Long reportCount;

    private String writer;

    private String reporter;

    private Long postId;
}
