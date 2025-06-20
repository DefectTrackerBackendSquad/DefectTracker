package com.example.defectTracker.controller;

import com.example.defectTracker.dto.DefectDto;
import com.example.defectTracker.entity.Defect;
import com.example.defectTracker.service.DefectService;
import com.example.defectTracker.utils.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/defect")
@RequiredArgsConstructor
public class DefectController {

    @Autowired
    private final DefectService defectService;

    @GetMapping("/{id}")
    public ResponseEntity<StandardResponse> getDefectByDefectId(@PathVariable String id) {
        Defect defect = defectService.getDefectByDefectId(id);
        if (defect != null) {
            return ResponseEntity.ok(
                    new StandardResponse("Success", "Retrieved successfully", defect, 200)
            );
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new StandardResponse("Error", "Defect not found", null, 404));
    }
}