package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.WorkExperience;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkExperienceViewModel {
    private long id;
    private String endDate;
    private String startDate;
    private String workplace;
    private String role;
    private String description;
    private String city;

    public WorkExperienceViewModel(WorkExperience we){
        this.id = we.getId();
        this.startDate = we.getStartDate().format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        this.endDate = we.getEndDate().format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        this.workplace = we.getWorkplace();
        this.role = we.getRole();
        this.city = we.getCity();
        this.description = we.getDescription();
    }

    public long getId() {
        return id;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStartDate() {
        return startDate;
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
