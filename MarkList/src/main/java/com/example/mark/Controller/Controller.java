package com.example.mark.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mark.Entity.Student;
import com.example.mark.Service.ServiceInterface;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	ServiceInterface service;
	
	@PostMapping("/student")
	public ResponseEntity<?> createStudent(@RequestBody Student student){
	    service.createStudent(student);
	    return ResponseEntity.status(HttpStatus.OK).body("Created Student");
	}

	@GetMapping("/getstudent")
	public ResponseEntity<List<Student>>  getAllStudent(){
		return service.getAllStudent();
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<?>getStudentById(@PathVariable int id){
		return service.getStudentById(id);
	
	}
	@PutMapping("/put/{id}")
	public ResponseEntity<?>updateStudent(@PathVariable int id, @RequestBody Student student){
		return service.updateStudent(id,student);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>deleteStudent(@PathVariable int id){
		return service.deleteStudent(id);
	}
	@GetMapping("/get")
	public List<Student> getStudentParam(@RequestParam(value="section",required = false)Set<String> sec){
		return service.getStudentParam(sec);
	}
	
	@GetMapping("/getFail")
	public List<Student> getFailedStudent(){
		return service.getFailedStudent();
	}
	


}
