package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Severity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeverityRepo extends JpaRepository<Severity, Long> {
}
