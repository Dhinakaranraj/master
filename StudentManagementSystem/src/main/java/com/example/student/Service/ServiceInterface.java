package com.example.student.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.Entity.Student;

@Service
public interface ServiceInterface {

	List<Student> getAllStudent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long StudentId);
	
	Student updateStudent(Student student);

	


}
