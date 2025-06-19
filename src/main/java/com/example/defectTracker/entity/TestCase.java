package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String testCaseId;

    private String description;

    private String steps;

    @ManyToOne
    @JoinColumn(name = "sub_module_id")
    private SubModule subModule;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "severity_id")
    private Severity severity;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

}
