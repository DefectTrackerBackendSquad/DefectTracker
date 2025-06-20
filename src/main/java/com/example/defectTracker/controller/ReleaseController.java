// src/main/java/com/example/defectTracker/controller/ReleaseController.java
package com.example.defectTracker.controller;

import com.example.defectTracker.dto.responseDto.ReleaseResponse;
import com.example.defectTracker.dto.responseDto.ApiResponse;
import com.example.defectTracker.exceptionHandler.ResourceNotFoundException;
import com.example.defectTracker.service.ReleaseService;
import com.example.defectTracker.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/release")
@RequiredArgsConstructor
public class ReleaseController {

    @Autowired
    private final ReleaseService releaseService;

    @GetMapping("/{releaseId}")
    public ResponseEntity<ApiResponse> getReleaseByReleaseId(@PathVariable String releaseId) {
        try {
            ReleaseResponse response = releaseService.getReleaseByReleaseId(releaseId);
            ApiResponse successResponse = new ApiResponse(
                    Constants.STATUS_SUCCESS,
                    Constants.RETRIEVED_SUCCESSFULLY,
                    "Release retrieved successfully",
                    response
            );
            return ResponseEntity.ok(successResponse);

        } catch (ResourceNotFoundException e) {
            ApiResponse notFoundResponse = new ApiResponse(
                    Constants.STATUS_FAILURE,
                    Constants.DATA_NOT_FOUND, // should be "10011"
                    "Release not found with id: " + releaseId,
                    null
            );
            return ResponseEntity.ok(notFoundResponse); // 🔥 Force 200 OK with failure message
        } catch (Exception e) {
            ApiResponse errorResponse = new ApiResponse(
                    Constants.STATUS_FAILURE,
                    Constants.RETRIEVE_FAILED,
                    "Something went wrong: " + e.getMessage(),
                    null
            );
            return ResponseEntity.ok(errorResponse); // 🔥 Return 200 with internal error msg
        }
    }
}
