package org.generation.italy.legion.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name  = "education")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titleEducation;
    @Column(columnDefinition = "date")
    private LocalDate startDate;
    @Column(columnDefinition = "date")
    private LocalDate endDate;
    private String description;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Education(String titleEducation, LocalDate startDate, LocalDate endDate, String description) {
        this.titleEducation = titleEducation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public Education() {
    }

    public long getId() {
        return id;
    }

    public String getTitleEducation() {
        return titleEducation;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }




}
