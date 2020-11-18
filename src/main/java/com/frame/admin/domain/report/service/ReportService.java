package com.frame.admin.domain.report.service;

import com.frame.admin.domain.report.domain.dto.GetReportsResponse;

import java.util.List;

public interface ReportService {
    public List<GetReportsResponse> getReports();
}
