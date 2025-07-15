package com.tdd.service;

public class EmailVerificationServiceException extends RuntimeException {

    public EmailVerificationServiceException(String message){
        super(message);
    }
}
