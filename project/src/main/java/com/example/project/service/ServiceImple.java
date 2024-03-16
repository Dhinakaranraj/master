package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.apiresponse.APIResponse;
import com.example.project.dto.Persondto;
import com.example.project.entity.Person;
import com.example.project.exception.UserNotFoundException;
import com.example.project.repository.BikeRepo;
import com.example.project.repository.PersonRepo;

@Service
public class ServiceImple implements ServiceInterface {
	
	@Autowired
	PersonRepo pRepo;
	
	@Autowired
	BikeRepo bRepo;

	 @Override
	    public Person createAccount(Persondto persondto) {
	        return pRepo.save(persondto.getPerson());
	    }
	    
	    @Override
	    public List<Person> getAllAccounts() {
	        return pRepo.findAll();
	    }

	    @Override
	    public Person getById(int id, Persondto person) throws UserNotFoundException {
	        Optional<Person> personOptional = pRepo.findById(id);
	        return personOptional.orElseThrow(() -> new UserNotFoundException("User id " + id + " not found in the database"));
	    }

	    @Override
	    public ResponseEntity<?> updateAccount(int id, Persondto person) {
	        Optional<Person> optional = pRepo.findById(id);
	        if (optional.isPresent()) {
	            Person per = optional.get();
	            if (person != null) {
	                per.setName(person.getName());
	                per.setAddress(person.getAddress());
	                per.setGender(person.getGender());
	                per.setMobileNo(person.getMobileNo());
	                per.setBike(per.getBike());
	            }
	            pRepo.save(per);
	            return ResponseEntity.ok().body("Update successfully!");
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @Override
	    public ResponseEntity<?> deleteAccount(int id) {
	        pRepo.deleteById(id);
	        return ResponseEntity.ok().body("Delete successfully!");
	    }
	    
	    @Override
	    public APIResponse getById(int id) {
	        APIResponse apiresponse = new APIResponse();
	        Optional<Person> pser = pRepo.findById(id);
	        if (pser.isPresent()) {
	            apiresponse.setData(pser.get());
	        } else {
	            apiresponse.setStatus(404);
	        }
	        return apiresponse;
	    }
	}
