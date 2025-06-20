package com.example.defectTracker.repository;

import com.example.defectTracker.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments, Long> {
}
