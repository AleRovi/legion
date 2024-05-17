package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;

import java.time.LocalDate;

public class EducationViewModel {

    private String titleEducation;
    private String startDate;
    private String endDate;
    private String description;

    public EducationViewModel(Education e) {
        this.titleEducation = e.getTitleEducation();
        this.startDate = e.getStartDate().toString();
        this.endDate = e.getEndDate().toString();
        this.description = e.getDescription();
    }

    public String getTitleEducation() {
        return titleEducation;
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
}
