package com.frame.admin.infra.springBoot.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade {
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public String getEmail() {
        Authentication auth = this.getAuthentication();
        if (auth.getPrincipal() instanceof AuthDetails) {
            return ((AuthDetails) auth.getPrincipal()).getAdmin().getId();
        } else {
            return this.getAuthentication().getName();
        }
    }
}