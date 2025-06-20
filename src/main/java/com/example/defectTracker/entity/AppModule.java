package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "app_module")
public class AppModule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moduleId;
    private String moduleName;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
