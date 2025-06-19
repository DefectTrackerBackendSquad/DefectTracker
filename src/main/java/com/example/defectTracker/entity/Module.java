package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moduleId;

    private String moduleName;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
}
