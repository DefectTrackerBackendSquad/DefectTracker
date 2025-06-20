package com.example.defectTracker.repository;

import com.example.defectTracker.entity.DefectHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DefectHistoryRepository extends JpaRepository<DefectHistory, Long> {
    List<DefectHistory> findByDefect_Id(Long defectId); // Query by defect_id
}