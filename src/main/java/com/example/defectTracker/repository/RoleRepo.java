package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
