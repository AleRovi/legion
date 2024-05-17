package org.generation.italy.legion.viewmodels;

import java.util.List;

public class CVViewModel {
    private StudentViewModel student;
    private List<EducationViewModel> educations;
    private List<WorkExperienceViewModel> experiences;

    public CVViewModel(StudentViewModel student, List<EducationViewModel> educations, List<WorkExperienceViewModel> experiences) {
        this.student = student;
        this.educations = educations;
        this.experiences = experiences;
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
