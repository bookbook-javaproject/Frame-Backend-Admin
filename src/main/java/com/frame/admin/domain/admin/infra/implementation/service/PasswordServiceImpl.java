package com.frame.admin.domain.admin.infra.implementation.service;

import com.frame.admin.domain.admin.domain.service.PasswordService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordServiceImpl implements PasswordService {

    @Override
    public String encode(String password) {
        return passwordEncoder().encode(password);
    }

    @Override
    public boolean matches(String password, String hashedPassword) {
        return passwordEncoder().matches(password, hashedPassword);
    }

    private PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
