package com.example.build.simple.REST.API.service;


import com.example.build.simple.REST.API.dto.StudentDto;

import java.util.List;

public interface StudentService {

    StudentDto createStudent(StudentDto studentDto);
    StudentDto updateStudent(Long studentId,StudentDto updatedStudent);
    StudentDto getStudentByID(Long studentId);
    List<StudentDto> getALlStudent();
    void deleteStudent(Long studentId);



}
