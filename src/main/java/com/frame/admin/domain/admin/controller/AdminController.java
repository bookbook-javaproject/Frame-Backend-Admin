package com.frame.admin.domain.admin.controller;

import com.frame.admin.domain.admin.dto.RegisterRequest;
import com.frame.admin.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void registerAccount(@RequestBody @Valid RegisterRequest request) {
        adminService.register(request);
    }
}
