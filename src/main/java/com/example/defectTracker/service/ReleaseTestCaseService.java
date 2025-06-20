package com.example.defectTracker.service;

import com.example.defectTracker.dto.ReleaseTestCaseDto;
import com.example.defectTracker.entity.ReleaseTestCase;

public interface ReleaseTestCaseService {
    ReleaseTestCase updateReleaseTestCase(Long id, ReleaseTestCaseDto dto);
    ReleaseTestCase createReleaseTestCase(ReleaseTestCaseDto dto);
}
