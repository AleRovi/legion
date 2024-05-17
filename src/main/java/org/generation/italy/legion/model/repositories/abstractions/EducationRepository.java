package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository  extends JpaRepository<Education, Long> {
    List<Education> findByStudentId(long id);
}
