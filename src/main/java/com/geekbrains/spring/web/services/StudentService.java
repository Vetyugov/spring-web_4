package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.data.Student;
import com.geekbrains.spring.web.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void changeScore(Long studentId, Integer delta) {
        Student student = studentRepository.findById(studentId);
        student.setScore(student.getScore() + delta);
        // studentRepository.save(student);
    }
}
