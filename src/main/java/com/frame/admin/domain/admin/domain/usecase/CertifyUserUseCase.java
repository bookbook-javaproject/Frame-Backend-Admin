package com.frame.admin.domain.admin.domain.usecase;

import com.frame.admin.domain.admin.dto.LoginRequest;

public interface CertifyUserUseCase {

    public void execute(String id, String password);
}
