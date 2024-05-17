package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkExperienceRepository  extends JpaRepository<WorkExperience, Long> {
    List<WorkExperience> findByStudentId(long id);
}

