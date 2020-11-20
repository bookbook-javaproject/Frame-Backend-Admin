package com.frame.admin.domain.post.service;

import com.frame.admin.domain.post.domain.dto.DeletePostRequest;

public interface PostService {

    public void deletePost(DeletePostRequest request);
}
