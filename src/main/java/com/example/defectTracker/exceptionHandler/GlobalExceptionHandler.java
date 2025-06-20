package com.example.defectTracker.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, Object>> handleRuntime(RuntimeException ex) {
        return ResponseEntity.status(404).body(Map.of(
                "timestamp", LocalDateTime.now(),
                "error", "Not Found",
                "message", ex.getMessage(),
                "status", 404
        ));
    }
}
