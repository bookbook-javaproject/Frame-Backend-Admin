package com.frame.admin.domain.report.domain.usecase;

import com.frame.admin.domain.report.domain.dto.GetReportsResponse;
import com.frame.admin.domain.report.domain.entity.Report.Report;
import com.frame.admin.domain.report.domain.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetReportsUseCaseImpl implements GetReportsUseCase {
    private final ReportRepository reportRepository;

    @Override
    public Iterable<Report> execute() {
        return reportRepository.findAll();
    }
}
