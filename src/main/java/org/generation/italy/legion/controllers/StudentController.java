package org.generation.italy.legion.controllers;

import org.generation.italy.legion.model.Student;
import org.generation.italy.legion.model.repositories.abstractions.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    private StudentRepository repo;

    public StudentController(StudentRepository repo){
        this.repo = repo;
        System.out.println(this.repo.getClass().getName());
    }
    @GetMapping(value = "/list")
    public String getAllStudents(Model model) {
        System.out.println("hello world");
        List<Student> all = repo.findAll();
        model.addAttribute("students", all);
        model.addAttribute("first_student", all.get(0));
        return "student/all_students";
    }
    @GetMapping(value = "/add")
    public String addStudent(){
        return "student/add_student";
    }
}
