package org.generation.italy.legion.viewmodels;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.WorkExperience;

import java.util.List;

public class CVViewModel {
    private StudentViewModel student;
    private List<Education> educations;
    private List<WorkExperience> experience;

    public CVViewModel(StudentViewModel student, List<Education> educations, List<WorkExperience> experience) {
        this.student = student;
        this.educations = educations;
        this.experience = experience;
    }
}
