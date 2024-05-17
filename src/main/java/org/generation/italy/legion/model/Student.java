package org.generation.italy.legion.model;

import jakarta.persistence.*;
import java.util.*;

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
    private String email;
    private String phoneNumber;
    private String address;
    @OneToMany(mappedBy = "student")
    private List<Education> educations = new ArrayList<>();
    @OneToMany(mappedBy = "student")
    private List<WorkExperience> workExperiences = new ArrayList<>();



    public Student() {
    }

    public Student(long id, String firstname, String lastname, LocalDate birthdate, String email, String phoneNumber, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }
}
