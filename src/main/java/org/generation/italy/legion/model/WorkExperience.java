package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name  = "workexperience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titleExperience;
    @Column(columnDefinition = "date")
    private LocalDate startDate;
    @Column(columnDefinition = "date")
    private LocalDate endDate;
    private String description;
    private String company;
    private String position;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public WorkExperience(long id, String titleExperience, LocalDate startDate, LocalDate endDate, String description, String company, String position, Student student) {
        this.id = id;
        this.titleExperience = titleExperience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.company = company;
        this.position = position;
        this.student = student;
    }

    public WorkExperience(){
    }

    public long getId() {
        return id;
    }

    public String getTitleExperience() {
        return titleExperience;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public Student getStudent() {
        return student;
    }

    public String getDescription() {
            return description;
    }



}
