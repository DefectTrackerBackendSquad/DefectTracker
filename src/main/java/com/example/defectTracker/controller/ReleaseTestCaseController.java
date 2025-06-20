package com.example.defectTracker.controller;

import com.example.defectTracker.dto.ReleaseTestCaseResponseDTO;

import com.example.defectTracker.exception.ResourceNotFoundException;
import com.example.defectTracker.service.ReleaseTestCaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/releases")
@RequiredArgsConstructor
public class ReleaseTestCaseController { // ✅ Correct class name

    private final ReleaseTestCaseService releaseService;

    // ✅ GET /api/v1/releases/RE0001/testcases
    @GetMapping("/{releaseId}")
    public ResponseEntity<?> getTestCasesByReleaseId(@PathVariable String releaseId) {
        List<ReleaseTestCaseResponseDTO> testCases = releaseService.getTestCasesByReleaseId(releaseId);

        if (testCases.isEmpty()) {
            throw new ResourceNotFoundException("No test cases found for release ID: " + releaseId);
        }

        return ResponseEntity.ok(testCases);
    }
}
