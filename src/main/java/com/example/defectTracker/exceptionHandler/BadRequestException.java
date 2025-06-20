// src/main/java/com/example/defectTracker/exceptions/BadRequestException.java
package com.example.defectTracker.exceptionHandler;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}