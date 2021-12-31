package com.rahman.studentsystem.controller;

import com.rahman.studentsystem.model.Student;
import com.rahman.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
}

@GetMapping(path = "/findAll")
    public List<Student> getAllStudent(){
        return  studentService.getAllStudent();
}

}
