package com.example.LearningRestAPIs.controller;

import com.example.LearningRestAPIs.dto.AddStudentRequestDto;
import com.example.LearningRestAPIs.dto.StudentDto;
import com.example.LearningRestAPIs.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudent() {
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudentById(id));
       return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable long id, @RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.ok(studentService.updateStudent(id, addStudentRequestDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudentPartially(@PathVariable long id, @RequestBody Map<String, Object> update) {
        return ResponseEntity.ok(studentService.updateStudentPartially(id, update));
    }
}
