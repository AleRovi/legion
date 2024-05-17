package org.generation.italy.legion.model.repositories.abstractions;

import org.generation.italy.legion.model.Address;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
    List<Education> findByStudentId(long id);
}
