package com.frame.admin.domain.admin.domain.exception;

import com.frame.admin.global.error.BusinessException;
import com.frame.admin.global.error.ErrorCode;

public class AuthenticationFailedException extends BusinessException {

    public AuthenticationFailedException() {super(ErrorCode.AUTHENTICATION_FAILED);}
}