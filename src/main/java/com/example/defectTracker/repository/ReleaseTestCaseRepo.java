package com.example.defectTracker.repository;

import com.example.defectTracker.entity.ReleaseTestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseTestCaseRepo extends JpaRepository<ReleaseTestCase, String> {
}
