package org.generation.italy.legion.model.services.implementations;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.model.repositories.abstractions.EducationRepository;
import org.generation.italy.legion.model.repositories.abstractions.StudentRepository;
import org.generation.italy.legion.model.repositories.abstractions.WorkExperienceRepository;
import org.generation.italy.legion.model.services.abstractions.CurriculumService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaCurriculumService implements CurriculumService {
    private EducationRepository eduRepo;
    private WorkExperienceRepository workRepo;
    private StudentRepository studentRepo;

    public JpaCurriculumService(EducationRepository eduRepo, WorkExperienceRepository workRepo, StudentRepository studentRepo) {
        this.eduRepo = eduRepo;
        this.workRepo = workRepo;
        this.studentRepo = studentRepo;
    }

    @Override
    public List<WorkExperience> getExperiencesFor(long studentId) {
        return null;
    }

    @Override
    public List<Education> getEducationFor(long studentId) {
        return null;
    }
}
