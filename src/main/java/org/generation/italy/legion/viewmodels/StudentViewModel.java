package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Student;

public class StudentViewModel {
    private long id;
    private String birthdate;

    public StudentViewModel(Student s){
        this.id = s.getId();
        this.birthdate = null;
    }
}
