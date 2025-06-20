package com.example.defectTracker.repository;

import com.example.defectTracker.entity.ProjectAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAllocationRepo extends JpaRepository<ProjectAllocation, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<ProjectAllocation> findByProjectId(Long projectId);
    // List<ProjectAllocation> findByEmployeeId(Long employeeId);
}
