package com.example.LearningRestAPIs.service.impl;

import com.example.LearningRestAPIs.dto.AddStudentRequestDto;
import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.entity.Student;
import com.example.LearningRestAPIs.repository.StudentRepository;
import com.example.LearningRestAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
//        return studentRepository.findAll().stream().map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail())).toList();
        return studentRepository.findAll().stream().map(student -> modelMapper.map(student, StudentDto.class)).toList();
    }

    @Override
    public StudentDto getStudentById(long id){
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
//        return new StudentDto(student.getId(), student.getName(), student.getEmail());
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto addStudent(AddStudentRequestDto addStudentRequestDto){
        Student newStudent = modelMapper.map(addStudentRequestDto, Student.class);
        Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public void deleteStudent(long id) {
        if(!studentRepository.existsById(id)){
            throw new RuntimeException("Student not found");
        }
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(long id, AddStudentRequestDto addStudentRequestDto) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        modelMapper.map(addStudentRequestDto, student);
        studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }

    @Override
    public StudentDto updateStudentPartially(long id, Map<String, Object> update) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        update.forEach((key, value) -> {
            switch (key) {
                case "name" -> student.setName((String) value);
                case "email" -> student.setEmail((String) value);
                default -> throw new RuntimeException("Invalid key: " + key);
            }
        });
        studentRepository.save(student);
        return modelMapper.map(student, StudentDto.class);
    }
}
