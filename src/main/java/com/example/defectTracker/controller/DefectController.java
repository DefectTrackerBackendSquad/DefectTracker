package com.example.defectTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DefectController {
    @GetMapping("/defect")
    public String getDefect() {
        return "Defect details";
    }
}
