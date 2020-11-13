package com.frame.admin.domain.admin.domain.usecase;

import com.frame.admin.domain.admin.domain.entity.Admin;
import com.frame.admin.domain.admin.domain.exception.AdminAlreadyExistsException;
import com.frame.admin.domain.admin.domain.repository.AdminRepository;
import com.frame.admin.domain.admin.domain.service.PasswordService;
import com.frame.admin.domain.admin.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateAdminUseCaseImpl implements CreateAdminUseCase {

    private final AdminRepository adminRepository;

    private final PasswordService passwordService;

    public void execute(RegisterRequest request) {
        adminRepository.findById(request.getId())
                .ifPresent(user -> {
                    throw new AdminAlreadyExistsException();
                });

        adminRepository.save(
                Admin.builder()
                .id(request.getId())
                .password(passwordService.encode(request.getPassword()))
                .build()
        );
    }
}
