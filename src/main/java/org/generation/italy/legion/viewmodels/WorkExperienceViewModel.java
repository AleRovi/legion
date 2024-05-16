package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkExperienceViewModel {
    private long id;
    private String startDate;
    private String endDate;
    private String workplace;
    private String role;
    private String description;
    private String city;

    public WorkExperienceViewModel(WorkExperience w) {
        this.id = w.getId();
        this.startDate = w.getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.endDate = w.getEndDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.workplace = w.getWorkplace();
        this.role = w.getRole();
        this.description = w.getDescription();
        this.city = w.getCity();
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

    public String getWorkplace() {
        return workplace;
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }
}
