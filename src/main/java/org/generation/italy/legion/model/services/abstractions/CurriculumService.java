package org.generation.italy.legion.model.services.abstractions;

import org.generation.italy.legion.model.Curriculum;
import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.WorkExperience;

import java.util.List;
import java.util.Optional;

public interface CurriculumService {
    List<WorkExperience> getExperiencesFor(long studentId);
    List<Education> getEducationsFor(long studentId);
    Optional<Curriculum> getCurriculumFor(long studentId);

}
