package com.service.user_service.user.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserException extends RuntimeException{

    public UserException(String msg) {
        super(msg);
    }
}
