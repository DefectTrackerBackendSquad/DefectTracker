package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepo extends JpaRepository<Designation, Long> {
    // Additional query methods can be defined here if needed
}
