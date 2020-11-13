package com.frame.admin.domain.admin.service;

import com.frame.admin.domain.admin.domain.usecase.CreateAdminUseCase;
import com.frame.admin.domain.admin.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final CreateAdminUseCase createAdminUseCase;

    @Override
    public void register(RegisterRequest request) {
        createAdminUseCase.execute(request);
    }
}
