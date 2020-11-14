package com.frame.admin.domain.admin.dto;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
public class LoginRequest {

    private String id;

    @NotEmpty
    @Size(min = 6, max = 30)
    private String password;
}