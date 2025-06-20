package com.example.defectTracker.repository;

import com.example.defectTracker.entity.ProjectAllocationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectAllocationHistoryRepo extends JpaRepository<ProjectAllocationHistory, Long> {

    // Additional query methods can be defined here if needed
    // For example, to find by project ID or employee ID, you can add:
    // List<ProjectAllocationHistory> findByProjectId(Long projectId);
    // List<ProjectAllocationHistory> findByEmployeeId(Long employeeId);
}
