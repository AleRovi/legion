package org.generation.italy.legion.model;

import jakarta.persistence.*;

@Entity
@Table(name="cover_letter")
public class CoverLetter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(mappedBy = "coverLetter")
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
