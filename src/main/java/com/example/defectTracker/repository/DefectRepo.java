package com.example.defectTracker.repository;

import com.example.defectTracker.dto.DefectDto;
import com.example.defectTracker.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DefectRepo extends JpaRepository<Defect, String> {
    // Custom query methods if needed
    Optional<Defect> findByDefectId(String defectId);
}