package com.example.defectTracker.dto.response;

import lombok.Data;
import java.sql.Time;
import java.util.Date;

@Data
public class DefectHistoryResponse {
    private Long id;
    private Date defectDate;
    private Time defectTime;
    private String previousStatus;
    private String assignedTo;
    private String assignedBy;
    private Long releaseId;
    private String defectStatus;
    private String formattedDefectId; // e.g. "DF-123"
}