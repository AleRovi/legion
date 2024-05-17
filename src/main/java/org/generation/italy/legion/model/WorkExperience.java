package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "work_experience")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    @Column(name = "start_date", nullable = false, columnDefinition = "date")
    private LocalDate startDate;
    @Column(name = "end_date", nullable = true, columnDefinition = "date")
    private LocalDate endDate;
    @Column(nullable = true, columnDefinition = "numeric")
    private BigDecimal salary;
    @Column(nullable = false)
    private String position;

    public long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
