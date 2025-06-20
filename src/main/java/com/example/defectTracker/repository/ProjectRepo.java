package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, String> {
}
