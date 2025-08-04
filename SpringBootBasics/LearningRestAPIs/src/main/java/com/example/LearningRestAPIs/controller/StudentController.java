package com.example.LearningRestAPIs.controller;

import com.example.LearningRestAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(1, "John", "Doe");
    }
}
