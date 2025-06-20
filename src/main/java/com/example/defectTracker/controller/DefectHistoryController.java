package com.example.defectTracker.controller;

import com.example.defectTracker.dto.response.DefectHistoryResponse;
import com.example.defectTracker.service.DefectHistoryService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/defect/history")
@RequiredArgsConstructor
public class DefectHistoryController {

    private final DefectHistoryService defectHistoryService;

    @GetMapping
    public ResponseEntity<?> getDefectHistoryByDefectId(
            @RequestParam String defectId) {

        if (defectId == null || defectId.trim().isEmpty()) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse("failure", "10019", "Missing Parameter: defectId"));
        }

        try {
            Long defectIdLong = Long.parseLong(defectId.replaceAll("[^0-9]", ""));
            List<DefectHistoryResponse> histories =
                    defectHistoryService.getDefectHistoryByDefectId(defectIdLong);

            if (histories.isEmpty()) {
                return ResponseEntity.badRequest().body(
                        new ErrorResponse("failure", "10009", "Data Not Found"));
            }

            return ResponseEntity.ok(
                    new SuccessResponse(
                            "success",
                            "10005",
                            "Defect history retrieved successfully",
                            new DefectHistoryResult(histories))
            );
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse("failure", "10008", "Invalid Defect ID format"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse("failure", "10006", "Retrieve Failed: " + e.getMessage()));
        }
    }


    @Data
    @AllArgsConstructor
    private static class SuccessResponse {
        private String status;
        private String statusCode;
        private String message;
        private DefectHistoryResult result;
    }

    @Data
    @AllArgsConstructor
    private static class DefectHistoryResult {
        private List<DefectHistoryResponse> history;
    }

    @Data
    @AllArgsConstructor
    private static class ErrorResponse {
        private String status;
        private String statusCode;
        private String message;

        // For backward compatibility
        public ErrorResponse(String statusCode, String message) {
            this("failure", statusCode, message);
        }
    }
}