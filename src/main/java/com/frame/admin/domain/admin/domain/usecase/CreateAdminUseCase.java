package com.frame.admin.domain.admin.domain.usecase;

import com.frame.admin.domain.admin.dto.RegisterRequest;

public interface CreateAdminUseCase {

    public void execute(RegisterRequest request);
}

