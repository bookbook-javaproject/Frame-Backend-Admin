package com.frame.admin.domain.notice.domain.repository;

import com.frame.admin.domain.notice.domain.entity.Notice;
import org.springframework.data.repository.CrudRepository;

public interface NoticeRepository extends CrudRepository<Notice, Long> {
}
