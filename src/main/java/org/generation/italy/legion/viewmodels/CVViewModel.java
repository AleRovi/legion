package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Curriculum;

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

    public CVViewModel(Curriculum c) {
        this.student= new StudentViewModel(c.getStudent());
        this.educations=c.getEducations().stream().map(EducationViewModel::new).toList();
        this.experiences=c.getWorkExperiences().stream().map(WorkExperienceViewModel::new).toList();
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
