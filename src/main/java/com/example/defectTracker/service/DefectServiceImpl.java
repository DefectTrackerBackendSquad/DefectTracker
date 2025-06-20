//package com.example.defectTracker.service;
//
//import com.example.defectTracker.dto.DefectDto;
//import com.example.defectTracker.entity.Defect;
//import com.example.defectTracker.repository.DefectRepo;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor // Lombok generates constructor
//public class DefectServiceImpl implements DefectService {
//
//    private final DefectRepo defectRepo; // Must be final for constructor injection
//
//    @Override
//    public Defect getDefectByDefectId(String id) {
//        return defectRepo.findByDefectId(id)
//                .orElse(null); // or throw custom exception
//    }
//}