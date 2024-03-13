package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Customer;
import com.example.springboot.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	ServiceIF service;

	@PostMapping("/create")
	public Customer createAccount(@RequestBody Customer customer ) {
		return service.createAccount(customer);
	}
	
	@GetMapping("/getall")
	public List<Customer> getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@GetMapping("/{id}/get")
	public Customer getById(@PathVariable Long id) {
		return service.getById(id);
	}
	@PutMapping("/{id}/update")
	public ResponseEntity<?>updateAccount(@PathVariable Long id,@RequestBody Customer customer){
		service.updateAccount(id,customer);
		return ResponseEntity.ok().body("update Successfully");
	}
	@DeleteMapping("/{id}/delete")
	public ResponseEntity<?>deleteAccount(@PathVariable Long id){
		service.deleteAccount(id);
		return ResponseEntity.ok().body("delete sucessfully");
	}
}
















