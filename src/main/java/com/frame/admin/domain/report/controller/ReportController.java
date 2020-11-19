package com.frame.admin.domain.report.controller;

import com.frame.admin.domain.report.domain.dto.ReportVO;
import com.frame.admin.domain.report.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {
    private final ReportService reportService;

    @GetMapping
    public List<ReportVO> getReports() {
        return reportService.getReports();
    }
}
