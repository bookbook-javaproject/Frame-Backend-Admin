package com.frame.admin.domain.report.domain.usecase;

import com.frame.admin.domain.report.domain.entity.Report.Report;
import com.frame.admin.domain.report.domain.repository.ReportRepository;
import com.frame.admin.global.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DeleteReportRelatedPostUseCaseImpl implements DeleteReportRelatedPostUseCase {

    private final ReportRepository reportRepository;

    @Override
    public void execute(Long reportId) {
        Optional<Report> optionalReport = reportRepository.findById(reportId);
        optionalReport.orElseThrow(NotFoundException::new);
        optionalReport.ifPresent(report -> {
            reportRepository.deleteAllByPostNumber(report.getPostNumber());
        });
    }
}
