package com.rahman.studentsystem.service;

import com.rahman.studentsystem.model.Student;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
