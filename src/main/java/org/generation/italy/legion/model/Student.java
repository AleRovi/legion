package org.generation.italy.legion.model;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Var;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
    private String phone;
    private String email;
    private String address;
    private String presentation;
    @Column(name = "cover_letter", nullable = true)
    private String coverLetter;
    private String hobby;
    @OneToMany(mappedBy = "student", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<WorkExperience> workExperiences = new ArrayList<>();
    @OneToMany(mappedBy = "student", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<Education> eduExperiences = new ArrayList<>();

    public Student() {}

    public long getId() {return id;}

    public Student(String firstname, String lastname, LocalDate birthdate, String phone, String email, String address, String presentation, String coverLetter, String hobby) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.presentation = presentation;
        this.coverLetter = coverLetter;
        this.hobby = hobby;
    }

    public Student(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public void addWorkExperiences(WorkExperience... workExps){
        this.workExperiences.addAll(Arrays.asList(workExps));
    }

    public void addEducations(Education... educations){
        this.eduExperiences.addAll(Arrays.asList(educations));
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPresentation() {
        return presentation;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public String getHobby() {
        return hobby;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public List<Education> getEduExperiences() {
        return eduExperiences;
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
}
