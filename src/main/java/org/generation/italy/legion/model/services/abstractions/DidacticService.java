package org.generation.italy.legion.model.services.abstractions;

import org.generation.italy.legion.model.Student;

import java.util.List;

public interface DidacticService {
     List<Student> findAllStudent();
     public List<Student> findStudentsByNameLike(String part);
}
