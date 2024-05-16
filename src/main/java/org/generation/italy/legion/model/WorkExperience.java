package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "WorkExperience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private String workplace;
    @Column(name = "start_date", columnDefinition = "date")
    private LocalDate startDate;
    @Column(name = "end_date", columnDefinition = "date")
    private LocalDate endDate;
    private String role;
    private String description;
    private String city;

    public WorkExperience(){}

    public Student getStudent() {
        return student;
    }

    public String getWorkplace() {
        return workplace;
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

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCity() {
        return city;
    }
}
