package com.example.defectTracker.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserPrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "privilege_id", nullable = false)
    private Privilege privilege;

    @ManyToOne
    @JoinColumn(name = "project_allocation_id")
    private ProjectAllocation projectAllocation;
}
