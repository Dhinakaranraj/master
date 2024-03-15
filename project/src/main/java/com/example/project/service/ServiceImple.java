package com.example.project.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
	   Person person =new Person();
	   person.setName(persondto.getName());
	   person.setAddress(persondto.getAddress());
	   person.setGender(persondto.getGender());
	   person.setMobileNo(persondto.getMobileNo());
	   return pRepo.save(person);
	   
	}
	@Override
	public List<Person> getAllAccounts(Set<String>add,String gen) {
		if(add==null) {
			return pRepo.findAll();
		}else {
			return pRepo.findAllByAddressAndGender(add,gen);
		}
	}

	@Override
	public Person getById(int id, Persondto person) throws UserNotFoundException {
	Person person1= pRepo.findById(id).orElse(null);
	if(person1!=null) {
		return person1;
	}else {
		throw new UserNotFoundException("User id" +id+ "not Found your database!");
	}
	}

	@Override
	public ResponseEntity<?> updateAccount(int id, Persondto person) {
		Optional<Person> optional=pRepo.findById(id);
		if(optional.isPresent()) {
			Person per=optional.get();
			per.setName(person.getName());
			per.setAddress(person.getAddress());
			per.setGender(person.getGender());
			per.setMobileNo(person.getMobileNo());
			
			pRepo.save(per);
			return ResponseEntity.ok().body("update succesfully!");
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@Override
	public ResponseEntity<?> createAccount(int id) {
		pRepo.deleteById(id);
		return ResponseEntity.ok().body("delete succesgully!");
	}
	@Override
	public APIResponse getById(int id) {
	 
		APIResponse apiresponse=new APIResponse();
		
		Optional<Person> pser=pRepo.findById(id);
		
		if(pser.isPresent()) {
			apiresponse.setData(pser.get());
		}else {
			 apiresponse.setStatus(404);
		}
		return apiresponse;
		
		
		
	}

}
