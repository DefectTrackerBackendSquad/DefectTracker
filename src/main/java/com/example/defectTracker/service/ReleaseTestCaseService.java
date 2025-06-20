package com.example.defectTracker.service;

import com.example.defectTracker.dto.ReleaseTestCaseResponseDTO;

import java.util.List;

public interface ReleaseService {
    List<ReleaseTestCaseResponseDTO> getTestCasesByReleaseId(Long releaseId);
}
