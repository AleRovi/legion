package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Student;

import java.time.LocalDate;

public class StudentViewModel {
    //stessi dati Student
    private long id;
    private String fullname;
    private String birthdate;
    private String email;
    private String phoneNumber;
    private String address;

    public StudentViewModel(Student s) {
        this.id = s.getId();
        this.birthdate = s.getBirthdate().toString();
        this.email = s.getEmail();
        this.fullname = s.getFirstname() + " " +s.getLastname();
        this.phoneNumber = s.getPhoneNumber();
        this.address = s.getAddress();
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
