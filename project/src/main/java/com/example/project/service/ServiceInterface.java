package com.example.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.apiresponse.APIResponse;
import com.example.project.dto.Persondto;
import com.example.project.entity.Person;
import com.example.project.exception.UserNotFoundException;

@Service
public interface ServiceInterface {

	Person createAccount(Persondto persondto);

	List<Person> getAllAccounts(Set<String>add,String gen);

	Person getById(int id, Persondto person)throws UserNotFoundException;

	ResponseEntity<?> updateAccount(int id, Persondto person);

	ResponseEntity<?> createAccount(int id);

	APIResponse getById(int id);

}
