package com.example.MVC.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MVC.Entity.Student;

@Service
public interface ServiceIF {

	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
