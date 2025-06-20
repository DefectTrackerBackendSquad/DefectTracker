package com.example.defectTracker.exceptionHandler;

public class ReleaseTestCaseNotFoundException extends RuntimeException {
    private final int code;
    public ReleaseTestCaseNotFoundException(int code, String message) {
        super(message);
        this.code = code;
    }
    public int getCode() { return code; }
}

