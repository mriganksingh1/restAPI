package com.example.restAPI.controller;

import com.example.restAPI.entity.Student;

import com.example.restAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student)
    {
           return this.studentService.addStudent(student);
    }

    @GetMapping("/findAll")
    public List<Student> getAllStudents()
    {
        return this.studentService.findAllStudents();
    }
}
