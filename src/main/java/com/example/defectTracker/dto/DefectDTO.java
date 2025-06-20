package com.example.defectTracker.dto;

import com.example.defectTracker.entity.Defect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DefectDTO {
    private Long id;
    private String defectId;
    private String description;
    private String steps;
    private int reOpenCount;
    private String assignedbyName;
    private String projectName;
    private String status;

    public DefectDTO(Defect defect) {
        if (defect == null) return;
        this.id = defect.getId();
        this.defectId = defect.getDefectId();
        this.description = defect.getDescription();
        this.steps = defect.getSteps();
        this.reOpenCount = defect.getReOpenCount();
        this.assignedbyName = (defect.getAssignedBy() != null) ? defect.getAssignedBy().getFirstName() + " " + defect.getAssignedBy().getLastName() : null;
        this.projectName = (defect.getProject() != null) ? defect.getProject().getProjectName() : null;
        this.status = (defect.getDefectStatus() != null) ? defect.getDefectStatus().getDefectStatusName() : null;
    }



}
