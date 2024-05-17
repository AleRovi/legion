package org.generation.italy.legion.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String street;
    @Column(name = "house_number", nullable = false)
    private String houseNumber;
    @Column(nullable = false)
    private String city;
    @Column(name = "zip_code", nullable = false)
    private String zipCode;
    @Column(nullable = false)
    private String country;
    @OneToMany(mappedBy = "address", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    List<Student> students = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public List<Student> getStudents() {
        return students;
    }
}
