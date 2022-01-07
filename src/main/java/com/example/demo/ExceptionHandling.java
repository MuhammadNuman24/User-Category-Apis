package com.example.demo;

public class ExceptionHandling extends RuntimeException{
    public ExceptionHandling() {
    }

    public ExceptionHandling(String message) {
        super(message);
    }

    public ExceptionHandling(String message, Throwable cause) {
        super(message, cause);
    }
}
