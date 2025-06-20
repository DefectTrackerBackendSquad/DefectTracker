package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepo extends JpaRepository<Priority, Long> {
    // Additional query methods can be defined here if needed
}
