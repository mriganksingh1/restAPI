package com.example.restAPI.service.Impl;

import com.example.restAPI.entity.Student;
import com.example.restAPI.repository.StudentRepository;
import com.example.restAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return this.studentRepository.findAll();
    }
}
