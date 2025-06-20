package com.example.defectTracker.dto;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class ReleaseTestCaseResponseDTO {
    private Long releaseTestCaseId;
    private String testCaseId;
    private String testCaseDescription;
    private String testSteps;
    private Date testDate;
    private Time testTime;
    private String testCaseStatus;
    private String testedBy; // User name
    private String releaseId;
}
