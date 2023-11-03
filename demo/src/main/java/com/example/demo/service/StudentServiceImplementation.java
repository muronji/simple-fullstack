package com.example.demo.service;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public student saveStudent(student student) {

        return studentRepository.save(student);
    }
    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}
