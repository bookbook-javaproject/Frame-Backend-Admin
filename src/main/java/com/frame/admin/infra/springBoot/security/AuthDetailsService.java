package com.frame.admin.infra.springBoot.security;

import com.frame.admin.domain.admin.domain.repository.AdminRepository;
import com.frame.admin.global.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class AuthDetailsService implements UserDetailsService {
    private final AdminRepository adminRepository;

    @Override
    public AuthDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        return adminRepository.findById(id)
                .map(AuthDetails::new)
                .orElseThrow(NotFoundException::new);
    }
}
