package org.generation.italy.legion.viewmodels;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentViewModel {
    private long id;
    private String birthdate;
    private String fullname;
    private String phone;
    private String email;
    private String address;
    private String presentation;
    private String coverLetter;
    private String hobby;

    public StudentViewModel(Student s){
        this.id = s.getId();
        this.fullname = s.getFirstname() + " " + s.getLastname();
        this.phone = s.getPhone();
        this.email = s.getEmail();
        this.address = s.getAddress();
        this.presentation = s.getPresentation();
        this.coverLetter = s.getCoverLetter();
        this.hobby = s.getHobby();
        this.birthdate = s.getBirthdate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public long getId() {
        return id;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getFullname() {
        return fullname;
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
}
