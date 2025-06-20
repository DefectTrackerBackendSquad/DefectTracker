package com.example.defectTracker.repository;

import com.example.defectTracker.entity.SubModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubModuleRepo extends JpaRepository<SubModule, String> {
}
