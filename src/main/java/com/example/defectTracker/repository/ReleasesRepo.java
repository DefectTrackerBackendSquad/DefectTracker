package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Releases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleasesRepo extends JpaRepository<Releases, Long> {
}
