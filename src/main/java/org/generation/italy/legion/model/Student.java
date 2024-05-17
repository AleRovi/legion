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
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false, columnDefinition = "date")
    private LocalDate birthdate;

    @ManyToOne
    @JoinColumn(name="address_id", nullable = false)
    private Address address;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="cover_letter_id", nullable = true)
    private CoverLetter coverLetter;

    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Education> educations = new ArrayList<>();
    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<WorkExperience> workExperiences = new ArrayList<>();
    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Hobby> hobbies = new ArrayList<>();






    public Student() {}

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

    public Address getAddress() {
        return address;
    }

    public CoverLetter getCoverLetter() {
        return coverLetter;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }
}


//nextval('student_id_seq'::regclass)
