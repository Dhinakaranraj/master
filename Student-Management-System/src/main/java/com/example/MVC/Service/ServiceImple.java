package com.example.MVC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MVC.Entity.Student;
import com.example.MVC.Repository.StudentRepo;

@Service
public class ServiceImple implements ServiceIF{
	
	@Autowired
	StudentRepo stuRepo;
	

	@Override
	public List<Student> getAllStudent() {
		return stuRepo.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		return stuRepo.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return stuRepo.findById(id).get();	
	}


	@Override
	public Student updateStudent(Student student) {
		return stuRepo.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		stuRepo.deleteById(id);
		
	}

}
