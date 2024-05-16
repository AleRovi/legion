package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Student;

public class StudentViewModel {
    //stessi dati di uno studente ma alcuni avranno un tipo diverso per essere mostrati meglio dalla view
    private long id;
    private String birthdate;

    public StudentViewModel(Student s){
        this.id = s.getId();
        this.birthdate = null; //serve un metodo per formattare la data
    }

}
