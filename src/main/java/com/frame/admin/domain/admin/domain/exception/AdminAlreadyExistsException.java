package com.frame.admin.domain.admin.domain.exception;

import com.frame.admin.global.error.BusinessException;
import com.frame.admin.global.error.ErrorCode;

public class AdminAlreadyExistsException extends BusinessException {

    public AdminAlreadyExistsException() {
        super(ErrorCode.CONFLICT);
    }
}

