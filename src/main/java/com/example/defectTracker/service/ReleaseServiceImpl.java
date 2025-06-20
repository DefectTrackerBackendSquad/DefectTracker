package com.example.defectTracker.service;

import com.example.defectTracker.dto.ReleasesDTO;
import com.example.defectTracker.entity.Project;
import com.example.defectTracker.entity.Releases;
import com.example.defectTracker.repository.ProjectRepo;
import com.example.defectTracker.repository.ReleasesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleasesRepo releasesRepo;

    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public ReleasesDTO createRelease(ReleasesDTO releasesDTO) {

        Releases release = new Releases();
        release.setReleaseId(generateNextReleaseId());
        release.setReleaseName(releasesDTO.getReleaseName());
        release.setReleasedate(releasesDTO.getReleasedate());
        release.setReleaseType(releasesDTO.getReleaseType());

        Long projectId = releasesDTO.getProjectId();
        Project project = projectRepo.findById(projectId)
                .orElseThrow(() -> new RuntimeException("Project not found with ID: " + projectId));
        release.setProject(project);

        Releases saved = releasesRepo.save(release);

        ReleasesDTO dto = new ReleasesDTO();
        dto.setReleaseName(saved.getReleaseName());
        dto.setReleasedate(saved.getReleasedate());
        dto.setReleaseType(saved.getReleaseType());
        dto.setProjectId(saved.getProject().getId());

        return dto;
    }

    // Helper method to generate incremental releaseId
    private String generateNextReleaseId() {
        Releases latest = releasesRepo.findTopByOrderByIdDesc();
        int nextNumber = 1;

        if (latest != null && latest.getReleaseId() != null) {
            String lastId = latest.getReleaseId();
            try {
                String numeric = lastId.substring(2);
                nextNumber = Integer.parseInt(numeric) + 1;
            } catch (NumberFormatException e) {
                nextNumber = 1;
            }
        }

        return String.format("RE%04d", nextNumber);
    }
}
