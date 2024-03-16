package com.example.project.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.project.apiresponse.APIResponse;
import com.example.project.dto.Persondto;
import com.example.project.entity.Person;
import com.example.project.exception.UserNotFoundException;
import com.example.project.service.ServiceInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	ServiceInterface service;

	@PostMapping("/create")
	public ResponseEntity<Person> createAccount(@RequestBody @Valid Persondto persondto) {
		Person createPerson= service.createAccount(persondto);
		 return ResponseEntity.status(HttpStatus.CREATED).body(createPerson);
	}
	
	@GetMapping("/getall")
	public List<Person> getAllAccounts(){
		return service.getAllAccounts();
	}
	
	@GetMapping("/{id}/get")
	public Person getById(@PathVariable int id,@RequestBody Persondto person) throws UserNotFoundException {
		return service.getById(id,person);
	}
	
	@PutMapping("/{id}/put")
	public ResponseEntity<?>updateAccount(@PathVariable int id,@RequestBody Persondto person){
		service.updateAccount(id,person);
	return 	ResponseEntity.ok().body("Update Succesfully! ");
	}
	
	@DeleteMapping("/{id}/delete")
	public ResponseEntity<?>deleteAccount(@PathVariable int id){
		service.deleteAccount(id);
		return ResponseEntity.ok().body("delete successfully!");
	}
	
	@GetMapping("/raw")
	public APIResponse getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	
	
	
	
	
	
}
