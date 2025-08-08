package com.example.LearningRestAPIs.service;

import com.example.LearningRestAPIs.dto.AddStudentRequestDto;
import com.example.LearningRestAPIs.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(long id);
    StudentDto addStudent(AddStudentRequestDto addStudentRequestDto);
    void deleteStudent(long id);
    StudentDto updateStudent(long id, AddStudentRequestDto addStudentRequestDto);
    StudentDto updateStudentPartially(long id, Map<String, Object> update);
}
