package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.Media;
import java.awt.*;

@Data
@Entity
public class Defect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String defectId;

    private String description;
    private int reOpenCount;
    private Media attachment;
    private String steps;



    @OneToOne
    @JoinColumn(name = "release_test_case_id")
    private ReleaseTestCase releaseTestCase;

    @ManyToOne
    @JoinColumn(name = "assigned_by")
    private User assignedBy;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    @ManyToOne
    @JoinColumn(name = "severity_id")
    private Severity severity;

    @ManyToOne
    @JoinColumn(name = "defect_status_id")
    private DefectStatus defectStatus;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type defectType;

}
