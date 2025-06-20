package com.example.defectTracker.repository;

import com.example.defectTracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
