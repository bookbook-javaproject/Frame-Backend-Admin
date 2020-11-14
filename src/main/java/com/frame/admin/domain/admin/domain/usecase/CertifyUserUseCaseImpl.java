package com.frame.admin.domain.admin.domain.usecase;

import com.frame.admin.domain.admin.domain.exception.AuthenticationFailedException;
import com.frame.admin.domain.admin.domain.repository.AdminRepository;
import com.frame.admin.domain.admin.domain.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CertifyUserUseCaseImpl implements CertifyUserUseCase {

    private final AdminRepository adminRepository;

    private final PasswordService passwordService;

    @Override
    public void execute(String id, String password) {
        adminRepository.findById(id)
                .filter(user -> passwordService.matches(password, user.getPassword()))
                .orElseThrow(AuthenticationFailedException::new);
    }
}
