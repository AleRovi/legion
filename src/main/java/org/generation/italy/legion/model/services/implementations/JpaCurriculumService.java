package org.generation.italy.legion.model.services.implementations;

import org.generation.italy.legion.model.*;
import org.generation.italy.legion.model.repositories.abstractions.*;
import org.generation.italy.legion.model.services.abstractions.CurriculumService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile("dev")
public class JpaCurriculumService implements CurriculumService {
    private AddressRepository ar;
    private CoverLetterRepository clr;
    private EducationRepository er;
    private HobbyRepository hr;
    private WorkExperienceRepository wer;
    private StudentRepository studentRepository;

    public JpaCurriculumService(AddressRepository ar, CoverLetterRepository clr, EducationRepository er, HobbyRepository hr, WorkExperienceRepository wer, StudentRepository studentRepository) {
        this.ar = ar;
        this.clr = clr;
        this.er = er;
        this.hr = hr;
        this.wer = wer;
        this.studentRepository = studentRepository;
    }

    @Override
    public List<WorkExperience> getExperiencesFor(long studentId) {
        return wer.findByStudentId(studentId);
    }

    @Override
    public List<Education> getEducationsFor(long studentId) {
        return er.findByStudentId(studentId);
    }

    @Override
    public Optional<Curriculum> getCurriculumFor(long studentId) {
        Optional<Student> os = studentRepository.findById(studentId);
        if (os.isEmpty()) {
            return Optional.empty();
        }
        List<WorkExperience> wes = wer.findByStudentId(studentId);
        List<Education> eds = er.findByStudentId(studentId);
        return Optional.of(new Curriculum(os.get(), wes, eds));
    }
}
