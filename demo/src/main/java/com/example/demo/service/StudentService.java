package com.example.demo.service;

import com.example.demo.model.student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    public student saveStudent(student student);
    public List<student> getAllStudents();
}
