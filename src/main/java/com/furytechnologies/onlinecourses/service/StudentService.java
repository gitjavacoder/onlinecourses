package com.furytechnologies.onlinecourses.service;


import com.furytechnologies.onlinecourses.model.Student;
import com.furytechnologies.onlinecourses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();

        for (Student student : studentRepository.findAll()) {
            students.add(student);
        }

        return students;
    }
}
