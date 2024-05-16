package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private String telephone;
    private String email;
    private String city;
    @Column(name="cover_letter",nullable = true)
    private String coverLetter;
    private String hobby;
    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Education> educations = new ArrayList<>();
    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<WorkExperience> we = new ArrayList<>();

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

    public String getCoverLetter() {
        return coverLetter;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<WorkExperience> getWe() {
        return we;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public long getId() {
        return id;
    }

    public String getHobby() {
        return hobby;
    }
}