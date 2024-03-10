package com.furytechnologies.onlinecourses.controller;

import com.furytechnologies.onlinecourses.model.Student;
import com.furytechnologies.onlinecourses.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * Persist list of students.
     *
     * @return ResponseEntity of List of Product
     * @throws UnsupportedEncodingException
     */
    @Operation(summary = "Add a student record")
    @PostMapping(value = "/students")
    public void saveProducts(@RequestBody Student student)
            throws UnsupportedEncodingException {
        studentService.saveStudent(student);
    }

    /**
     * Retrieve all students from database.
     *
     * @return List<Student>
     */
    @Operation(summary = "Retrieve all student records")
    @GetMapping(value = "/students")
    public List<Student> getProductsDB() {
        return this.studentService.getAllStudents();
    }

}
