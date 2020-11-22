package com.frame.admin.domain.report.service;
import com.frame.admin.domain.post.domain.entity.Post.Post;
import com.frame.admin.domain.post.domain.usecase.DeletePostUseCase;
import com.frame.admin.domain.post.domain.usecase.GetPostUseCase;
import com.frame.admin.domain.report.domain.dto.ApproveReportRequest;
import com.frame.admin.domain.report.domain.dto.ReportVO;
import com.frame.admin.domain.report.domain.entity.Report.Report;
import com.frame.admin.domain.report.domain.usecase.DeleteReportRelatedPostUseCase;
import com.frame.admin.domain.report.domain.usecase.GetCountAboutReportsByPostUseCase;
import com.frame.admin.domain.report.domain.usecase.GetReportedPostIdUseCase;
import com.frame.admin.domain.report.domain.usecase.GetReportsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {
    private final GetReportsUseCase getReportsUseCase;
    private final GetCountAboutReportsByPostUseCase getCountAboutReportsByPostUseCase;
    private final GetReportedPostIdUseCase getReportedPostIdUseCase;
    private final DeleteReportRelatedPostUseCase deleteReportRelatedPostUseCase;


    private final GetPostUseCase getPostUseCase;
    private final DeletePostUseCase deletePostUseCase;

    @Override
    public List<ReportVO> getReports() {
        List<ReportVO> reports = new ArrayList<ReportVO>();
        for (Report report : getReportsUseCase.execute()) {
            Long postId = report.getPostNumber();
            Post post = getPostUseCase.execute(postId);
            reports.add(
                    ReportVO.builder()
                    .reportId(report.getReportNumber())
                    .content(report.getContent())
                    .reportCount(Long.valueOf(getCountAboutReportsByPostUseCase.execute(postId)))
                    .writer(post.getWriter())
                    .reporter(report.getReporter())
                    .postId(report.getPostNumber())
                    .build()
            );
        }
        return reports;
    }

    @Override
    public void approveReport(ApproveReportRequest request) {
        deletePostUseCase.execute(getReportedPostIdUseCase.execute(request.getReportId()));
        deleteReportRelatedPostUseCase.execute(request.getReportId());
    }
}
