package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    @Column(nullable = false)
    private String description;

    public long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public String getDescription() {
        return description;
    }
}
