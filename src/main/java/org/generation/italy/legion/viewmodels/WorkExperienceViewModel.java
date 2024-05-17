package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.WorkExperience;

import java.time.LocalDate;

public class WorkExperienceViewModel {

    private String titleExperience;
    private String startDate;
    private String endDate;
    private String description;
    private String company;
    private String position;

    public WorkExperienceViewModel(WorkExperience we) {
        this.titleExperience = we.getTitleExperience();
        this.startDate = we.getStartDate().toString();
        this.endDate = we.getEndDate().toString();
        this.description = we.getDescription();
        this.company = we.getCompany();
        this.position = we.getPosition();
    }

    public String getTitleExperience() {
        return titleExperience;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }
}
