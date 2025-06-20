//package com.example.defectTracker.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Date;
//
//@Data
//@Entity
//public class Releases {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String releaseId;
//
//    private String releaseName;
//
//    private Date releasedate;
//
//    private String releaseType;
//
//    @ManyToOne
//    @JoinColumn(name = "project_id")
//    private Project project;
//
//    public void setReleaseDate(Date releaseDate) {
//        this.releasedate = releaseDate;
//    }
//}

package com.example.defectTracker.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Releases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String releaseId;

    private String releaseName;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;  // ✅ Renamed to camelCase

    private String releaseType;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;
}

