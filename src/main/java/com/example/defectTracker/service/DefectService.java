package com.example.defectTracker.service;

import com.example.defectTracker.dto.DefectDto;
import com.example.defectTracker.entity.Defect;


public interface DefectService {
    DefectDto getDefectByDefectId(String id);
}