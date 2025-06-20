package com.example.defectTracker.service;

import com.example.defectTracker.dto.ReleaseTestCaseResponseDTO;
import com.example.defectTracker.entity.ReleaseTestCase;
import com.example.defectTracker.exception.ResourceNotFoundException;
import com.example.defectTracker.repository.ReleasesRepo;
import com.example.defectTracker.repository.ReleaseTestCaseRepo;
import com.example.defectTracker.repository.ReleasesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReleaseServiceImpl implements ReleaseService {

    private final ReleaseTestCaseRepo releaseTestCaseRepository;
    private final ReleasesRepo releaseRepo;

    @Override
    public List<ReleaseTestCaseResponseDTO> getTestCasesByReleaseId(Long releaseId) {

        if (!releaseRepo.existsById(String.valueOf(releaseId))) {
            throw new ResourceNotFoundException("Release ID " + releaseId + " not found");
        }


        List<ReleaseTestCase> releaseTestCases = releaseTestCaseRepository.findByReleasesId(releaseId);

        return releaseTestCases.stream().map(rtc -> {
            ReleaseTestCaseResponseDTO dto = new ReleaseTestCaseResponseDTO();
            dto.setReleaseTestCaseId(rtc.getId());
            dto.setTestCaseId(rtc.getTestCase().getTestCaseId());
            dto.setTestCaseDescription(rtc.getTestCase().getDescription());
            dto.setTestSteps(rtc.getTestCase().getSteps());
            dto.setTestDate(rtc.getTestDate());
            dto.setTestTime(rtc.getTestTime());
            dto.setTestCaseStatus(rtc.getTestCaseStatus());
            dto.setTestedBy(rtc.getUser() != null ? rtc.getUser().getFirstName() + " " + rtc.getUser().getLastName() : null);
            dto.setReleaseId(rtc.getReleases().getId());
            return dto;
        }).collect(Collectors.toList());
    }
}
