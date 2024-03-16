package com.example.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.apiresponse.APIResponse;
import com.example.project.dto.Persondto;
import com.example.project.entity.Person;
import com.example.project.exception.UserNotFoundException;

@Service
public interface ServiceInterface {

	Person createAccount(Persondto persondto);

	List<Person> getAllAccounts();

	Person getById(int id, Persondto person)throws UserNotFoundException;

	ResponseEntity<?> updateAccount(int id, Persondto person);


	APIResponse getById(int id);

	ResponseEntity<?> deleteAccount(int id);

}
