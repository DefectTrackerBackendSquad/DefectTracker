package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectRepo extends JpaRepository<Defect, String> {
}
