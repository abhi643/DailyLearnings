package com.example.LearningRestAPIs.service;

import com.example.LearningRestAPIs.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
