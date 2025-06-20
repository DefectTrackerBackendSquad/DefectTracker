package com.example.defectTracker.service;

import com.example.defectTracker.dto.DefectDto;
import com.example.defectTracker.entity.Defect;


public interface DefectService {
    Defect getDefectByDefectId(String id);
}