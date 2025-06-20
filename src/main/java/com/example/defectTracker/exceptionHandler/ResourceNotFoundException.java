// src/main/java/com/example/defectTracker/exceptions/ResourceNotFoundException.java
package com.example.defectTracker.exceptionHandler;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}