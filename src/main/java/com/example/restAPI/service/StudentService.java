package com.example.restAPI.service;

import com.example.restAPI.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    List<Student> findAllStudents();
}
