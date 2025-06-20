package com.example.defectTracker.controller;

import com.example.defectTracker.dto.ReleasesDTO;
import com.example.defectTracker.service.ReleaseService;
import com.example.defectTracker.utils.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/releases")
@RequiredArgsConstructor
public class ReleasesController {

    private final ReleaseService releaseService;

    @PostMapping
    public ResponseEntity<StandardResponse> create(@RequestBody ReleasesDTO releasesDTO) {
        ReleasesDTO created = releaseService.createRelease(releasesDTO);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new StandardResponse("Success", "Release created", created, 201));
    }



}
