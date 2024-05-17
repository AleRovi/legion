package org.generation.italy.legion.controllers;

import org.generation.italy.legion.model.Education;
import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.services.abstractions.CurriculumService;
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
    private CurriculumService cvService;


//    public StudentController(StudentRepository repo){
//        this.repo = repo;
//        System.out.println(this.repo.getClass().getName());
//    }
public StudentController(DidacticService didacticService,CurriculumService cvService){
        this.didacticService = didacticService;
        this.cvService = cvService;
        System.out.println(this.didacticService.getClass().getName());
        System.out.println(this.cvService.getClass().getName());
    }

    @GetMapping(value = "/showcv/{id}")
    public String showCVFor(@PathVariable("id") long id, Model model){
        Optional<Student> os = didacticService.findStudentById(id);
        if(os.isEmpty()){
            model.addAttribute("error_message", "lo studente non esiste");
            return "student/error";
        }
        Student student = os.get();
        StudentViewModel studentView = new StudentViewModel(student);
        List<EducationViewModel> eduModels = student.getEduExperiences().stream().map(e->new EducationViewModel(e)).toList();
        List<WorkExperienceViewModel> workModels = student.getWorkExperiences().stream().map(WorkExperienceViewModel::new).toList();
        CVViewModel cvModel = new CVViewModel(studentView,eduModels, workModels);
        model.addAttribute("cv", cvModel);
        return "student/student_cv";
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
