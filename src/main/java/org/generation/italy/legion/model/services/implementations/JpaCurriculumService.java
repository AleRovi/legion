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
    private StudentRepository studentRepo;
    private WorkExperienceRepository workRepo;

    public JpaCurriculumService(EducationRepository eduRepo, StudentRepository studentRepo, WorkExperienceRepository workRepo) {
        this.eduRepo = eduRepo;
        this.studentRepo = studentRepo;
        this.workRepo = workRepo;
    }
    @Override
    public List<WorkExperience> getExperiencesFor(long studentId) {
        return workRepo.findByStudentId(studentId);
    }

    @Override
    public List<Education> getEducationsFor(long studentId) {
        return eduRepo.findByStudentId(studentId);
    }
}
