// src/main/java/com/example/defectTracker/repository/ReleaseRepository.java
package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Releases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReleaseRepository extends JpaRepository<Releases, Long> {
    Optional<Releases> findByReleaseId(String releaseId);
}