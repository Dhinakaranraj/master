package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Course;

@RestController
@RequestMapping("/course")
public class Controller {
	
	@Autowired
private	Service service;
    
	@PostMapping
	public Course createAccount(@RequestBody Course course) {
		return ((Controller) service).createAccount(course);
	}
    @GetMapping     
    public List<Course>getAllCourse(){
	return ((Controller) service).getAllCourse();
}


     @DeleteMapping("/delete/{id}")
     public List<Course> deleteById(@PathVariable int id) {
	 return ((Controller) service).deleteById(id);
}




}