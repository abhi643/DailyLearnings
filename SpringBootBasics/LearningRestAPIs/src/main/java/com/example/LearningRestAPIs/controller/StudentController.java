package com.example.LearningRestAPIs.controller;

import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public List<StudentDto> getStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(1, "John", "Doe");
    }
}
