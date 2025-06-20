package com.example.defectTracker.repository;


import com.example.defectTracker.entity.Defect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface DefectRepository extends JpaRepository<Defect, Long> {
    @Query("SELECT d FROM Defect d " +
            "LEFT JOIN FETCH d.assignedTo " +
            "LEFT JOIN FETCH d.project " +
            "LEFT JOIN FETCH d.defectStatus " +
            "WHERE d.assignedBy.id = :userId")
    List<Defect> findByAssignedById(@Param("userId") Long userId);
}
