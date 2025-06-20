package com.example.defectTracker.service;

import com.example.defectTracker.entity.Releases;
import com.example.defectTracker.repository.ReleasesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReleasesServiceImpl implements ReleasesService {

    @Autowired
    private ReleasesRepo releasesRepo;

    // 🔍 Search for releases with optional filters
    @Override
    public List<Releases> searchReleases(String releaseName, String releaseType, Date releaseDate, Long projectId) {
        return releasesRepo.searchReleases(releaseName, releaseType, releaseDate, projectId);
    }
}