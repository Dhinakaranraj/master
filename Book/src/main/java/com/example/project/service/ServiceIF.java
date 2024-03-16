package com.example.project.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.entity.Author;

@Service
public interface ServiceIF {

	Author createAccount(Author author);

	List<Author> getAllAccounts();

	Author getById(int id);



	ResponseEntity<?> updateAccount(int id, Author author);


	ResponseEntity<?> deleteAccount(int id);

}
