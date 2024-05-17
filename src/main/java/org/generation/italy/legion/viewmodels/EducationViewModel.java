package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.utils.DateUtils;

import java.time.LocalDate;

public class EducationViewModel {
    private String startDate;
    private String endDate;
    private String startDateIso;
    private String endDateIso;
    private String area;
    private String title;

    public EducationViewModel(Education e) {
        this.startDate = DateUtils.format(e.getStartDate());
        this.endDate = DateUtils.format(e.getEndDate());
        this.startDateIso = DateUtils.formatIso(e.getStartDate());
        this.endDateIso = DateUtils.formatIso(e.getEndDate());
        this.area = e.getArea();
        this.title = e.getTitle();
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

    public String getArea() {
        return area;
    }

    public String getTitle() {
        return title;
    }
}
