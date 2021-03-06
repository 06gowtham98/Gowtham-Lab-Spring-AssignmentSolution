package com.greatlearning.studentcollegefest.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.studentcollegefest.entity.Student;

public interface StudentService {

	List<Student> findAll();

	Optional<Student> FindById(int id);

	String save(Student theStudent);

	String DeleteById(int id);

}
