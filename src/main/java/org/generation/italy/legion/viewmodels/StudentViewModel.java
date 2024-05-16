package org.generation.italy.legion.viewmodels;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.utils.DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StudentViewModel {
    //stessi dati Student
    private long id;
    private String fullName;
    private String birthdate;
    private String telephone;
    private String email;
    private String city;
    private String hobby;


    public StudentViewModel(Student s){
        this.id = s.getId();
        this.birthdate = DateUtils.format(s.getBirthdate());
        this.fullName=String.format("%s %s",s.getFirstname(),s.getLastname());
        this.telephone=s.getTelephone();
        this.email=s.getEmail();
        this.city=s.getCity();
        this.hobby=s.getHobby();
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthdate() {
        return birthdate;
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

    public String getHobby() {
        return hobby;
    }
}
