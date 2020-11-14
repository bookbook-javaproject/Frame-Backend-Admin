package com.frame.admin.domain.admin.domain.service;

public interface PasswordService {

    public String encode(String password);

    public boolean matches(String password, String hashedPassword);
}
