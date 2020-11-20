package com.frame.admin.domain.notice.dto;


import lombok.Getter;

@Getter
public class CreateNoticeRequest {
    private String title;

    private String content;
}
