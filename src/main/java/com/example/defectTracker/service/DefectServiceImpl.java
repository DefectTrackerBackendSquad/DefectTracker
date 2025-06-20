package com.example.defectTracker.service;

import com.example.defectTracker.dto.DefectDto;
import com.example.defectTracker.entity.Defect;
import com.example.defectTracker.repository.DefectRepo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Lombok generates constructor
public class DefectServiceImpl implements DefectService {

    Logger logger = LoggerFactory.getLogger(DefectServiceImpl.class);

    private final DefectRepo defectRepo; // Must be final for constructor injection

    @Override
    public DefectDto getDefectByDefectId(String id) {
        DefectDto defectDto = new DefectDto();
        Optional<Defect> defect = defectRepo.findByDefectId(id);
        logger.info("Fetching defect with ID: {}", id);
        if (defect != null && defect.isPresent()) {
            logger.info("Defect found: {}", defect.get());
            BeanUtils.copyProperties(defectDto, defect);
            return defectDto;
        } else {
            // Handle the case where the defect is not found
            return null; // or throw an exception
        }
    }
}