package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class GroupPrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "privilege_id")
    private Privilege privilege;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
