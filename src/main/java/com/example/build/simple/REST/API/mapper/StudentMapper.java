package com.example.build.simple.REST.API.mapper;

import com.example.build.simple.REST.API.dto.StudentDto;
import com.example.build.simple.REST.API.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getGender());
    }

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getGender());
    }

}
