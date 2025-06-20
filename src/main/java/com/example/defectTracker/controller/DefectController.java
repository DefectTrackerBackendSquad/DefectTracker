package com.example.defectTracker.controller;

import com.example.defectTracker.dto.DefectDTO;
import com.example.defectTracker.entity.Defect;
import com.example.defectTracker.service.DefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/defects")
public class DefectController {

    private final DefectService defectService;

    @Autowired
    public DefectController(DefectService defectService) {
        this.defectService = defectService;
    }

    @GetMapping("/assignBy/{userId}")
    public List<DefectDTO> getDefectsByAssignee(@PathVariable Long userId) {
        List<Defect> defects = defectService.getDefectsByAssignee(userId);
        return defects.stream()
                .map(DefectDTO::new)
                .collect(Collectors.toList());
    }
}
