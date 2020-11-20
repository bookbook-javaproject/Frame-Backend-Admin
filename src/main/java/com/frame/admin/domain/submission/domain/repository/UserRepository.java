package com.frame.admin.domain.submission.domain.repository;

import com.frame.admin.domain.submission.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
