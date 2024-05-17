package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "education")
public class Education {
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
    @Column(nullable = false)
    private String area;
    @Column(nullable = true)
    private String title;

    public long getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getArea() {
        return area;
    }

    public String getTitle() {
        return title;
    }
}
