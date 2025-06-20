package com.example.defectTracker.repository;

import com.example.defectTracker.entity.AllocateModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocateModuleRepo extends JpaRepository<AllocateModule, String> {
}
