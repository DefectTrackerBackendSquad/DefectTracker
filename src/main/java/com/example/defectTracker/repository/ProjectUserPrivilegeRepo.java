package com.example.defectTracker.repository;

import com.example.defectTracker.entity.ProjectUserPrivilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectUserPrivilegeRepo extends JpaRepository<ProjectUserPrivilege, Long> {
}
