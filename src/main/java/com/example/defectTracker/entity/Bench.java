package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Bench {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String benchId;

    private int availability;
    private int allocated;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;
}
