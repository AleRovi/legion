package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EducationViewModel {
    private long id;
    private String startDate;
    private String endDate;
    private String school;
    private String course;
    private String description;
    private String city;

    public EducationViewModel(Education e) {
        this.id = e.getId();
        this.startDate = e.getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.endDate = e.getEndDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.school = e.getSchool();
        this.course = e.getSchool();
        this.description = e.getDescription();
        this.city = e.getCity();
    }

    public long getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getSchool() {
        return school;
    }

    public String getCourse() {
        return course;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }
}
