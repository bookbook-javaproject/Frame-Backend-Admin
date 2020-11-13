package com.frame.admin.global.exceptions;

import com.frame.admin.global.error.BusinessException;
import com.frame.admin.global.error.ErrorCode;

public class InvalidTokenException extends BusinessException {
    public InvalidTokenException() {
        super(ErrorCode.UNAUTHORIZED);
    }
}
