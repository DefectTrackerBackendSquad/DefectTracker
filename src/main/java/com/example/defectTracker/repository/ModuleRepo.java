package com.example.defectTracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.defectTracker.entity.Module;

public interface ModuleRepo extends JpaRepository<Module, String> {
    // Additional query methods can be defined here if needed
}
