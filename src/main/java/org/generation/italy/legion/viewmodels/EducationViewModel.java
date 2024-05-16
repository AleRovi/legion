package org.generation.italy.legion.viewmodels;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.utils.DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EducationViewModel {
    private long id;
    private String school;
    private String startDate;
    private String endDate;
    private String course;
    private String description;
    private String city;
    public EducationViewModel(Education ed){

        this.id=ed.getId();
        this.school=ed.getSchool();
        this.startDate=DateUtils.format(ed.getStartDate());
        this.endDate=DateUtils.format(ed.getEndDate());
        this.course=ed.getCourse();
        this.description=ed.getDescription();
        this.city=ed.getCity();
    }

    public long getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
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
