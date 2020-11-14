package com.frame.admin.global.exceptions;

import com.frame.admin.global.error.BusinessException;
import com.frame.admin.global.error.ErrorCode;

public class NotFoundException extends BusinessException {

    public NotFoundException() {
        super(ErrorCode.NOT_FOUND);
    }
}
