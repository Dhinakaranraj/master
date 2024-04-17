package com.example.mark.Service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.mark.Entity.Student;

@Service
public interface ServiceInterface {

	ResponseEntity<?> createStudent(Student student);

	ResponseEntity<List<Student>> getAllStudent();

	ResponseEntity<?> getStudentById(int id);

	ResponseEntity<?> updateStudent(int id, Student student);

	ResponseEntity<?> deleteStudent(int id);

	List<Student> getStudentParam(Set<String> sec);

	List<Student> getFailedStudent();

}
