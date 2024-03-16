package com.example.project.controller;

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

import com.example.project.entity.Author;
import com.example.project.service.ServiceIF;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	ServiceIF service;
	
	@PostMapping
	public Author createAccount(@RequestBody Author author){
		return service.createAccount(author);
	}
    @GetMapping
    public List<Author>getAllAccounts(){
    	return service.getAllAccounts();
    }
    @GetMapping("/{id}")
    public Author getById(@PathVariable int id) {
    	return service.getById(id);
    }
   
   @PutMapping("/{id}")
   public ResponseEntity<?>updateAccount(@PathVariable int id,@RequestBody Author author){
	 return service.updateAccount(id,author);
   }
    
   @DeleteMapping("/{id}")
   public ResponseEntity<?>deleteAccount(@PathVariable int id){
	  return service.deleteAccount(id);
   }
   
   
   
    
  }
