package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Bench;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenchRepo extends JpaRepository<Bench, String> {
}
