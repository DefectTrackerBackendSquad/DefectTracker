// src/main/java/com/example/defectTracker/service/ReleaseService.java
package com.example.defectTracker.service;

import com.example.defectTracker.dto.responseDto.ReleaseResponse;

public interface ReleaseService {
    ReleaseResponse getReleaseByReleaseId(String releaseId);
}