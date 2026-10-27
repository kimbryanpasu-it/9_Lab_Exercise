package com.csit321g2.exception;

public class NameNotFoundException extends RuntimeException {
    public NameNotFoundException(String message) {
        super(message);
    }
}