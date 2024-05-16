package org.generation.italy.legion.controllers;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.model.services.abstractions.CurriculumService;
import org.generation.italy.legion.model.services.abstractions.DidacticService;
import org.generation.italy.legion.viewmodels.CVViewModel;
import org.generation.italy.legion.viewmodels.EducationViewModel;
import org.generation.italy.legion.viewmodels.StudentViewModel;
import org.generation.italy.legion.viewmodels.WorkExperienceViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
//    private StudentRepository repo;
    private DidacticService didacticService;
    private CurriculumService cvService;


//    public StudentController(StudentRepository repo){
//        this.repo = repo;
//        System.out.println(this.repo.getClass().getName());
//    }
public StudentController(DidacticService didacticService, CurriculumService cvService){
        this.didacticService = didacticService;
        this.cvService = cvService;
        System.out.println(this.didacticService.getClass().getName());
    }

    @GetMapping(value = "/showcv/{id}")
    public String showCVFor(long id, Model model){
    /*tramite un servizio ci carichiamo lo studente
      da questo studente creiamo lo studentviewmodel con i suoi dati
      tramite un servizio carichiamo la lista delle workexperience di questo studente
      a partire da questa lista di workexperience creiamo una lista di workexperienceviewmodel
      tramite un servizio ci carichiamo la lista delle education ddi questo studente
      a partire da questa lista di education creiamo una lista di educationviewmodel
      creiamo un cvviewmodel che conterrà studentviewmodel, la lista di workexperienceviewmodel e
      la lista di educationviewmodel
      questo oggetto cvviewmodel lo registro nella classe Model (m.addAttribute()) con una certa chiave
      vado a creare la thymeleaf (studentCV) la quale prenderà i suoi dati dall'oggetto registrato
     */

        Optional<Student> s = didacticService.findStudentsById(id);
        if(s.isEmpty()){
            return "student/all_students";
        }
        Student student = s.get();
        StudentViewModel studentView = new StudentViewModel(student);
        List<EducationViewModel> eduModels = student.getEduExperiences().stream()
                .map(EducationViewModel::new).toList();
        List<WorkExperienceViewModel> workModels = student.getWorkExperiences().stream()
                .map(WorkExperienceViewModel::new).toList();
        CVViewModel cv = new CVViewModel(studentView, eduModels, workModels);
        model.addAttribute("cv", cv);
        return "student/student_cv";
    }

    @GetMapping(value = "/list")
    public String getAllStudents(Model model) {
        System.out.println("hello world");
        List<Student> all = didacticService.findAllStudent();
        model.addAttribute("students", all);
        model.addAttribute("first_student", all.get(0));
        return "student/all_students";
    }
    @GetMapping(value = "/add")
    public String addStudent(){
        return "student/add_student";
    }
}
