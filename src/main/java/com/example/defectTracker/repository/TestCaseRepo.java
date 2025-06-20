package com.example.defectTracker.repository;


import com.example.defectTracker.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepo extends JpaRepository<TestCase, String> {
}
