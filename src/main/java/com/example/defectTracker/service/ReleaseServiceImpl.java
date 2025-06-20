// src/main/java/com/example/defectTracker/service/impl/ReleaseServiceImpl.java
package com.example.defectTracker.service;

import com.example.defectTracker.dto.responseDto.ReleaseResponse;
import com.example.defectTracker.entity.Releases;
import com.example.defectTracker.exceptionHandler.ResourceNotFoundException;
import com.example.defectTracker.repository.ReleaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReleaseServiceImpl implements ReleaseService {

    private final ReleaseRepository releaseRepository;

    @Override
    public ReleaseResponse getReleaseByReleaseId(String releaseId) {
        Releases release = releaseRepository.findByReleaseId(releaseId)
                .orElseThrow(() -> new ResourceNotFoundException("Release not found with id: " + releaseId));

        return mapToReleaseResponse(release);
    }

    private ReleaseResponse mapToReleaseResponse(Releases release) {
        ReleaseResponse response = new ReleaseResponse();
        response.setReleaseId(release.getReleaseId());
        response.setReleaseName(release.getReleaseName());
        response.setProjectId(release.getProject().getProjectId());
        response.setReleaseDate(String.valueOf(release.getReleaseDate()));
        response.setReleaseType(release.getReleaseType());
        return response;
    }
}