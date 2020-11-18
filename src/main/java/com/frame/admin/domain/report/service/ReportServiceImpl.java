package com.frame.admin.domain.report.service;
import com.frame.admin.domain.post.domain.entity.Post.Post;
import com.frame.admin.domain.post.domain.usecase.GetPostUseCase;
import com.frame.admin.domain.report.domain.dto.GetReportsResponse;
import com.frame.admin.domain.report.domain.entity.Report.Report;
import com.frame.admin.domain.report.domain.usecase.GetReportsByPostUseCase;
import com.frame.admin.domain.report.domain.usecase.GetReportsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final GetReportsUseCase getReportsUseCase;
    private final GetReportsByPostUseCase getReportsByPostUseCase;

    private final GetPostUseCase getPostUseCase;

    @Override
    public List<GetReportsResponse> getReports() {
        List<GetReportsResponse> reports = new ArrayList<GetReportsResponse>();
        for (Report report : getReportsUseCase.execute()) {
            Long postId = report.getPostNumber();
            int count = 0;
            for (Report reportByPost : getReportsByPostUseCase.execute(postId)) {
                count++;
            }

            Post post = getPostUseCase.execute(postId);
            reports.add(
                    GetReportsResponse.builder()
                    .reportId(report.getReportNumber())
                    .content(report.getContent())
                    .reportCount(Long.valueOf(count))
                    .writer(post.getWriter())
                    .reporter(report.getReporter())
                    .build()
            );
        }
        return reports;
    }
}
