package com.example.defectTracker.controller;

import com.example.defectTracker.dto.ReleaseTestCaseDto;
import com.example.defectTracker.entity.ReleaseTestCase;
import com.example.defectTracker.service.ReleaseTestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/release-test-cases")
public class ReleaseTestCaseController {
    @Autowired
    private ReleaseTestCaseService releaseTestCaseService;

    @PostMapping
    public ResponseEntity<ReleaseTestCase> createReleaseTestCase(@RequestBody ReleaseTestCaseDto dto) {
        ReleaseTestCase created = releaseTestCaseService.createReleaseTestCase(dto);
        return ResponseEntity.ok(created);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateReleaseTestCase(@PathVariable Long id, @RequestBody ReleaseTestCaseDto dto) {
        releaseTestCaseService.updateReleaseTestCase(id, dto);
        // Return custom success response structure
        return ResponseEntity.ok(
            new java.util.HashMap<String, Object>() {{
                put("status", "success");
                put("statusCode", 2000);
                put("message", "Updated Successfully");
            }}
        );
    }


}
