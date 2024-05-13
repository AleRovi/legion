package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
