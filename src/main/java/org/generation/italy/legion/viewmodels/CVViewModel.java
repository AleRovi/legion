package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.WorkExperience;

import java.util.List;

public class CVViewModel {
    private StudentViewModel student;
    private List<EducationViewModel> educations;
    private List<WorkExperienceViewModel> experiences;

    public CVViewModel(StudentViewModel student, List<EducationViewModel> educations, List<WorkExperienceViewModel> experience) {
        this.student = student;
        this.educations = educations;
        this.experiences = experience;
    }

    public StudentViewModel getStudent() {
        return student;
    }

    public List<EducationViewModel> getEducations() {
        return educations;
    }

    public List<WorkExperienceViewModel> getExperiences() {
        return experiences;
    }
}
