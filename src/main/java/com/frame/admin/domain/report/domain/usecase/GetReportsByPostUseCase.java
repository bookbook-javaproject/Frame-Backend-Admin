package com.frame.admin.domain.report.domain.usecase;

import com.frame.admin.domain.report.domain.entity.Report.Report;

public interface GetReportsByPostUseCase {
    public Iterable<Report> execute(Long postId);
}
