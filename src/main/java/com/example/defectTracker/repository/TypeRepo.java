package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepo extends JpaRepository<Type, Long> {
}
