package com.example.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.student.Entity.Student;
import com.example.student.Service.ServiceInterface;

@Controller
public class StudentController {
	
	@Autowired
	ServiceInterface service;
	
	@GetMapping("/student")
	public String listStudent(Model model) {
		model.addAttribute("students",service.getAllStudent());
		return "students";
	}
	
	@GetMapping("/student/new")
	public String createStudentFrom(Model model) {
		
		Student student=new Student();
		model.addAttribute("student", student);
		return "createstudent";
	}
	
	@PostMapping("/student")
	public String saveStudent(@ModelAttribute ("student") Student student) {
		service.saveStudent(student);
		return "redirect:/student";
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model) {
		model.addAttribute("student", service.getStudentById(id));
		return "editstudent";
		
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		Student existingStudent=service.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstname(student.getFirstname());
		existingStudent.setLastname(student.getLastname());
		existingStudent.setEmail(student.getEmail());
		
		service.updateStudent(existingStudent);
		return "redirect:/student";
		
		
		
	}
	
	
	

}
