package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;
    @Column(columnDefinition = "date")
    private LocalDate birthdate;


    public Student() {
    }

    public Student(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public long getId() {
        return id;
    }
}
