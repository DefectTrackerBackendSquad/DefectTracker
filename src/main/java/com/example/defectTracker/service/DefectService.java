package com.example.defectTracker.service;

import com.example.defectTracker.entity.Defect;
import java.util.List;

public interface DefectService {
    List<Defect> getDefectsByAssignee(Long userId);

    //List<Defect> getDefectsAssignee(Long userId);
}
