package com.example.defectTracker.repository;

import com.example.defectTracker.entity.DefectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectStatusRepo extends JpaRepository<DefectStatus, Long> {
}
