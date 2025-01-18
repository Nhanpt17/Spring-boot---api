package com.example.build.simple.REST.API.service;

import com.example.build.simple.REST.API.dto.StudentDto;
import com.example.build.simple.REST.API.entity.Student;
import com.example.build.simple.REST.API.exception.ResourceNotFoundException;
import com.example.build.simple.REST.API.mapper.StudentMapper;
import com.example.build.simple.REST.API.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        Student student = studentRepository.save(StudentMapper.mapToStudent(studentDto));

        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto updatedStudent) {
        Student student =  studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFoundException("Student is not exists with given id "+studentId ));

        student.setFirstName(updatedStudent.getFirstName());
        student.setLastName(updatedStudent.getLastName());
        student.setGender(updatedStudent.getGender());

        Student student1 = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(student1);
    }

    @Override
    public StudentDto getStudentByID(Long studentId) {
        Student student =  studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFoundException("Student is not exists with given id "+studentId ));

        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public List<StudentDto> getALlStudent() {
        List<Student> students = studentRepository.findAll();

        return students.stream().map((student)->StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteStudent(Long studentId) {
        Student student =  studentRepository.findById(studentId).orElseThrow(()-> new ResourceNotFoundException("Student is not exists with given id "+studentId ));

        studentRepository.deleteById(studentId);
    }
}
