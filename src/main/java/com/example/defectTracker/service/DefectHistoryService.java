package com.example.defectTracker.service;

import com.example.defectTracker.dto.response.DefectHistoryResponse;
import java.util.List;

public interface DefectHistoryService {
    List<DefectHistoryResponse> getDefectHistoryByDefectId(Long defectId);  // Changed to Long
}