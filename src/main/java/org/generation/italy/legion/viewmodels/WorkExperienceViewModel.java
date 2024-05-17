package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.utils.DateUtils;

import java.time.LocalDate;

public class WorkExperienceViewModel {
    private String startDate;
    private String endDate;
    private String startDateIso;
    private String endDateIso;
    private String salary;
    private String position;

    public WorkExperienceViewModel(WorkExperience we) {
        this.startDate = DateUtils.format(we.getStartDate());
        this.endDate = we.getEndDate() != null ? DateUtils.format(we.getEndDate()) : "In corso";
        this.startDateIso = DateUtils.formatIso(we.getStartDate());
        this.endDateIso = we.getEndDate() != null ? DateUtils.formatIso(we.getEndDate()) : "In corso";
        this.salary = we.getSalary() != null ? we.getSalary().toString() : "Salario non disponibile";
        this.position = we.getPosition();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStartDateIso() {
        return startDateIso;
    }

    public String getEndDateIso() {
        return endDateIso;
    }

    public String getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
