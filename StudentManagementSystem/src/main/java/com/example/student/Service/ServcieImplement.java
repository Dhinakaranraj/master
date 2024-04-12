package com.example.student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Entity.Student;
import com.example.student.Repository.StudentRepository;

@Service
public class ServcieImplement implements ServiceInterface{
	
	@Autowired
	StudentRepository stuRepo;

	@Override
	public List<Student> getAllStudent() {
		return stuRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return stuRepo.save(student);
	}

	@Override
	public Student getStudentById(Long StudentId) {
		return stuRepo.findById(StudentId).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return stuRepo.save(student);
	}

}
