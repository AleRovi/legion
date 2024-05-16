package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "educationExperiences")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    private String school;
    @Column(name = "start_date", columnDefinition = "date")
    private LocalDate startDate;
    @Column(name = "end_date", columnDefinition = "date")
    private LocalDate endDate;
    private String course;
    private String description;
    private String city;

    public Education(){}

    public Student getStudent() {
        return student;
    }

    public long getId() {
        return id;
    }

    public String getSchool() {
        return school;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
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
