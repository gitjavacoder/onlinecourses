package com.furytechnologies.onlinecourses.repository;

import com.furytechnologies.onlinecourses.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
