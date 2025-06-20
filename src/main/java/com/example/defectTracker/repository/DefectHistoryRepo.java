package com.example.defectTracker.repository;

import com.example.defectTracker.entity.DefectHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefectHistoryRepo extends JpaRepository<DefectHistory, Long> {
}
