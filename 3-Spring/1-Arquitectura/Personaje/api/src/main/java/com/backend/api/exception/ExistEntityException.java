package com.backend.api.exception;

public class ExistEntityException extends RuntimeException {
    public ExistEntityException(String message) {
        super(message);
    }
}
