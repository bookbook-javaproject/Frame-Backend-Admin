package com.frame.admin.domain.admin.dto;

import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class RegisterRequest {

    @NotEmpty
    private String id;

    @NotEmpty
    private String password;
}
