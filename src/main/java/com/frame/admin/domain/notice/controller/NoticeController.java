package com.frame.admin.domain.notice.controller;

import com.frame.admin.domain.admin.dto.LoginRequest;
import com.frame.admin.domain.admin.dto.LoginResponse;
import com.frame.admin.domain.admin.dto.RegisterRequest;
import com.frame.admin.domain.notice.dto.CreateNoticeRequest;
import com.frame.admin.domain.notice.dto.GetNoticeResponse;
import com.frame.admin.domain.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/notice")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public GetNoticeResponse getNotice() {
        return noticeService.getNotice();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createNotice(@RequestBody @Valid CreateNoticeRequest request) {
        noticeService.createNotice(request);
    }
}
