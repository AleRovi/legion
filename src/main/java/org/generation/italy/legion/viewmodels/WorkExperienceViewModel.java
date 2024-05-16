package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.utils.DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WorkExperienceViewModel {
    private long id;
    private String workPlace;
    private String startDate;
    private String endDate;
    private String role;
    private String description;
    private String city;
    public WorkExperienceViewModel(WorkExperience we){
        this.id=we.getId();
        this.workPlace=we.getWorkPlace();
        this.startDate=DateUtils.format(we.getStartDate());
        this.endDate=DateUtils.format(we.getEndDate());
        this.role=we.getRole();
        this.description=we.getDescription();
        this.city=we.getCity();

    }

    public long getId() {
        return id;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
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
