package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@   Table(name = "work_experiences")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name="work_place")
    private String workPlace;
    @Column(name="start_date",columnDefinition = "date")
    private LocalDate startDate;
    @Column(name="end_date",columnDefinition = "date")
    private LocalDate endDate;
    private String role;
    private String description;
    private String city;

    public WorkExperience() {
    }

    public long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
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
