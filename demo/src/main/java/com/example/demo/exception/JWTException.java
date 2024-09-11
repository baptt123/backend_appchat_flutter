package com.example.demo.exception;

public class JWTException extends RuntimeException {
    public JWTException() {
        super("Không có JWT");
    }
}
