package com.frame.admin.domain.post.domain.repository;

import com.frame.admin.domain.post.domain.entity.Post.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
