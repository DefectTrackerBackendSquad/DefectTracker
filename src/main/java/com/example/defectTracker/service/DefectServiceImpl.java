package com.example.defectTracker.service;


import com.example.defectTracker.entity.Defect;
import com.example.defectTracker.repository.DefectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public  class DefectServiceImpl implements DefectService {

    private final DefectRepository defectRepository;

    @Autowired

    public DefectServiceImpl(DefectRepository defectRepository) {
        this.defectRepository = defectRepository;
    }

    @Override
    public List<Defect> getDefectsByAssignee(Long userId) {
        return defectRepository.findByAssignedById(userId);
    }

//    @Override
//    public List<Defect> getDefectsAssignee(Long userId) {
//        return defectRepository.findByAssignedbyId(userId);
//    }
}