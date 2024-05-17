package org.generation.italy.legion.controllers;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.WorkExperience;
import org.generation.italy.legion.model.services.abstractions.DidacticService;
import org.generation.italy.legion.viewmodels.CVViewModel;
import org.generation.italy.legion.viewmodels.EducationViewModel;
import org.generation.italy.legion.viewmodels.StudentViewModel;
import org.generation.italy.legion.viewmodels.WorkExperienceViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
//    private StudentRepository repo;
    private DidacticService didacticService;


//    public StudentController(StudentRepository repo){
//        this.repo = repo;
//        System.out.println(this.repo.getClass().getName());
//    }
public StudentController( DidacticService didacticService){
        this.didacticService = didacticService;
        System.out.println(this.didacticService.getClass().getName());
    }


    @GetMapping(value = "/showcv/{id}")
    public String showCVFor(@PathVariable("id") long id, Model model) {
        /*
        tramite un servizio ci carichiamo su lo studente
        da questo studente creiamo lo StudentViewModel con i suoi dati
        tramite un servizio ci carichiamo la lista delle WorkExperience di questo studente
        a partire da questa lista di WorkExperience creiamo una lista di WorkExperienceViewModel
        tramite un servizio ci carichiamo la lista delle Education di questo studente
        a partire da questa lista di Education creiamo una lista di EducationViewModel
        creiamo un CurriculumViewModel che conterrà StudentViewModel, la lista di WorkExperienceViewModel e
        la lista di EducationViewModel
        questo oggettoCVViewModel lo registro nella classe Model (m.addAttribute()) con una certa chiave.
        Vado a creare la thymeleaf (studentCV) la quale prenderà i suoi dati dall'oggetto registrato
         */
        Optional<Student> os = didacticService.findStudentById(id);
        if (os.isEmpty()){
            return "client_error";
        }
        Student s = os.get();
        List<WorkExperience> wes = s.getWorkExperiences();
        List<Education> eds = s.getEducations();
        List<WorkExperienceViewModel> wesModel = wes.stream().map(WorkExperienceViewModel::new).toList();
        List<EducationViewModel> edsModel = eds.stream().map(EducationViewModel::new).toList();
        CVViewModel cv = new CVViewModel(new StudentViewModel(s),edsModel,wesModel);
        model.addAttribute("cv",cv);
        return "student/studentCV";
    }


    @GetMapping(value = "/list")
    public String getAllStudents(Model model) {
        System.out.println("hello world");
        List<Student> all = didacticService.findAllStudent();
        model.addAttribute("students", all);
        return "student/all_students";
    }
    @GetMapping(value = "/add")
    public String addStudent(){
        return "student/add_student";
    }
    @GetMapping(value="/search")
    public String getAllStudentsContainingPart(Model model,@RequestParam(name = "part",defaultValue = "") String part) {
        List<Student> all = switch(part) {
            case "" -> didacticService.findAllStudent();
            default -> didacticService.findStudentsByNameLike(part);
        };
        model.addAttribute("students", all);
       // model.addAttribute("part", part);
        return "student/all_students_containing_part";
    }
}
