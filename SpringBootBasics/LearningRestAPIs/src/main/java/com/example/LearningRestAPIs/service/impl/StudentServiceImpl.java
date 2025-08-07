package com.example.LearningRestAPIs.service.impl;

import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.repository.StudentRepository;
import com.example.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream().map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail())).toList();
    }
}
