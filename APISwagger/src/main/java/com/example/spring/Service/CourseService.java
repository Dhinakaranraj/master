package com.example.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.spring.dto.CourseRepository;
import com.example.spring.model.Course;

@Service
public class CourseService {
	
	@Autowired
   CourseRepository courseRepo;
	
	public Course createAccount(Course course) {
		return courseRepo.save(course);
	
	}

	public List<Course>getAllCourses(){
		return courseRepo.findAll();
	}
	
	public List<Course>deleteCourseById(@PathVariable int id){
	   courseRepo.deleteById(id);
	   return courseRepo.findAll();
	}
}
