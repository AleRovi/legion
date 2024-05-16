package org.generation.italy.legion.model.services.abstractions;

import org.generation.italy.legion.model.Student;

import java.util.List;
import java.util.Optional;

public interface DidacticService {
     List<Student> findAllStudent();
     List<Student> findStudentsByNameLike(String part);

     Optional<Student> findStudentsById(long id);
}
