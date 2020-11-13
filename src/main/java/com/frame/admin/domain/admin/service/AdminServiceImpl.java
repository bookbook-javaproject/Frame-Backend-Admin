package com.frame.admin.domain.admin.service;

import com.frame.admin.domain.admin.domain.usecase.CertifyUserUseCase;
import com.frame.admin.domain.admin.domain.usecase.CreateAdminUseCase;
import com.frame.admin.domain.admin.dto.LoginRequest;
import com.frame.admin.domain.admin.dto.LoginResponse;
import com.frame.admin.domain.admin.dto.RegisterRequest;
import com.frame.admin.infra.springBoot.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final CreateAdminUseCase createAdminUseCase;
    private final CertifyUserUseCase certifyUserUseCase;

    private final JwtProvider jwtProvider;

    @Override
    public void register(RegisterRequest request) {
        createAdminUseCase.execute(request);
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        certifyUserUseCase.execute(request.getId(), request.getPassword());
        return LoginResponse.builder()
                .accessToken(jwtProvider.generateAccessToken(request.getId()))
                .refreshToken(jwtProvider.generateRefreshToken(request.getId()))
                .build();
    }
}
