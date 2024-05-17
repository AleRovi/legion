package org.generation.italy.legion.viewmodels;

import jakarta.persistence.*;
import org.generation.italy.legion.model.*;
import org.generation.italy.legion.utils.DateUtils;


import java.util.stream.Collectors;

public class StudentViewModel {
    //stessi dati Student
    private long id;
    private String fullname;
    private String birthdate;

    private String city;
    private String country;


    private String coverLetterText;
    private String hobbies;


    public StudentViewModel(Student s){
        this.id = s.getId();
        this.fullname = String.format("%s %s", s.getFirstname(), s.getLastname());
        this.birthdate = DateUtils.format(s.getBirthdate());
        this.city = s.getAddress().getCity();
        this.country = s.getAddress().getCountry();
        this.coverLetterText = s.getCoverLetter() != null ? s.getCoverLetter().getDescription() : "NO COVER LETTER";
        this.hobbies = s.getHobbies().stream().map(Hobby::getDescription).collect(Collectors.joining(", "));
    }

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getCoverLetterText() {
        return coverLetterText;
    }

    public String getHobbies() {
        return hobbies;
    }
}
