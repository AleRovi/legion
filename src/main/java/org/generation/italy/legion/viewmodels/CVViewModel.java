package org.generation.italy.legion.viewmodels;



import java.util.List;

public class CVViewModel {
    private StudentViewModel student;
    private List<EducationViewModel> educations;
    private List<WorkExperienceViewModel> works;

    public CVViewModel(StudentViewModel student, List<EducationViewModel> educations, List<WorkExperienceViewModel> works) {
        this.student = student;
        this.educations = educations;
        this.works = works;
    }

    public StudentViewModel getStudent() {
        return student;
    }

    public List<EducationViewModel> getEducations() {
        return educations;
    }

    public List<WorkExperienceViewModel> getWorks() {
        return works;
    }
}
