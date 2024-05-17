package org.generation.italy.legion.model.services.abstractions;

import org.generation.italy.legion.model.Student;

import java.util.List;
import java.util.Optional;

public interface DidacticService {
     Optional<Student> findStudentById(long id);
     List<Student> findAllStudent();
     public List<Student> findStudentsByNameLike(String part);

}
