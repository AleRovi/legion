package org.generation.italy.legion.model.repositories.abstractions;

import org.apache.catalina.LifecycleState;
import org.generation.italy.legion.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Long> {
    List<Education> findByStudentId(long id);
}
