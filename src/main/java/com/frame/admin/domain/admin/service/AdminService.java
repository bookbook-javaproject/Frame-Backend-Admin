package com.frame.admin.domain.admin.service;

import com.frame.admin.domain.admin.dto.LoginRequest;
import com.frame.admin.domain.admin.dto.LoginResponse;
import com.frame.admin.domain.admin.dto.RegisterRequest;

public interface AdminService {

    public void register(RegisterRequest request);

    public LoginResponse login(LoginRequest request);
}
