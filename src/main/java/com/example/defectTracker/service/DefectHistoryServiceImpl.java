package com.example.defectTracker.service;

import com.example.defectTracker.dto.response.DefectHistoryResponse;
import com.example.defectTracker.entity.DefectHistory;
import com.example.defectTracker.repository.DefectHistoryRepository;
import com.example.defectTracker.service.DefectHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DefectHistoryServiceImpl implements DefectHistoryService {

    private final DefectHistoryRepository defectHistoryRepository;

    @Override
    public List<DefectHistoryResponse> getDefectHistoryByDefectId(Long defectId) {
        List<DefectHistory> histories = defectHistoryRepository.findByDefect_Id(defectId);

        return histories.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private DefectHistoryResponse mapToResponse(DefectHistory history) {
        DefectHistoryResponse response = new DefectHistoryResponse();
        response.setId(history.getId());
        response.setDefectDate(history.getDefectDate());
        response.setDefectTime(history.getDefectTime());
        response.setPreviousStatus(history.getPreviousStatus());
        response.setAssignedTo(history.getAssignedTo());
        response.setAssignedBy(history.getAssignedBy());
        response.setReleaseId(history.getReleaseId());
        response.setDefectStatus(history.getDefectStatus());
        response.setFormattedDefectId("DF-" + history.getDefect().getId());
        return response;
    }
}