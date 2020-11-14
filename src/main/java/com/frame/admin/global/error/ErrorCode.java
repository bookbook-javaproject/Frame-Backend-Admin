package com.frame.admin.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum     ErrorCode {
    BAD_REQUEST(400, "Bad Request"),
    AUTHENTICATION_FAILED(401, "Authentication Failed"),
    UNAUTHORIZED(403, "UnAuthorized"),
    NOT_FOUND(404, "Not Found"),
    CONFLICT(409, "Conflict");

    private final int status;

    private final String message;
}
