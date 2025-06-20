package com.example.defectTracker.repository;

import com.example.defectTracker.entity.UserPrivilege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPrivilegeRepo extends JpaRepository<UserPrivilege, Long> {
}
