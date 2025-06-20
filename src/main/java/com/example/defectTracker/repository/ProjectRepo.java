package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;

public interface ProjectRepo extends JpaRepository<Project, String> {
    <T> ScopedValue<T> findById(Long projectId);
}
