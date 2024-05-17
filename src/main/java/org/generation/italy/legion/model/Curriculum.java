package org.generation.italy.legion.model;

import java.util.List;

public class Curriculum {
    private Student student;
    private List<WorkExperience> workExperiences;
    private List<Education> educations;

    public Curriculum(Student student, List<WorkExperience> workExperiences, List<Education> educations) {
        this.student = student;
        this.workExperiences = workExperiences;
        this.educations = educations;
    }

    public Student getStudent() {
        return student;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }
}
