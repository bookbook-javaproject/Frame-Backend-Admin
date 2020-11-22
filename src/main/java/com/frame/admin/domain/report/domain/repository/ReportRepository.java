package com.frame.admin.domain.report.domain.repository;

import com.frame.admin.domain.report.domain.entity.Report.Report;
import org.springframework.data.repository.CrudRepository;


public interface ReportRepository extends CrudRepository<Report, Long> {
    public int countByPostNumber(Long postId);

    public void deleteAllByPostNumber(Long postId);
}
