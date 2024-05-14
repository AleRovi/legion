package org.generation.italy.legion.controllers;

import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.repositories.abstractions.StudentRepository;
import org.generation.italy.legion.model.services.abastractions.DidacticService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    public String getAllStudentsContainingPart(Model model,@RequestParam(value="part",defaultValue = "none") String part) {
        List<Student> all = switch(part) {
            case "none" -> didacticService.findAllStudent();
            default -> didacticService.findStudentsByNameLike(part);
        };
        System.out.println(part);
        model.addAttribute("students", all);
       // model.addAttribute("part", part);
        return "student/all_students_containing_part";
    }
}
