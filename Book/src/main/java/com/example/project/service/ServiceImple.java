package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.entity.Author;
import com.example.project.repository.AuthorRepository;
import com.example.project.repository.BookRepository;

@Service
public class ServiceImple implements ServiceIF {
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	BookRepository bookRepo;

	@Override
	public Author createAccount(Author author) {
		return authorRepo.save(author);
	}

	@Override
	public List<Author> getAllAccounts() {
		return authorRepo.findAll();
	}

	@Override
	public Author getById(int id) {
		return authorRepo.findById(id).orElse(null);
	}

	@Override
	public ResponseEntity<?> updateAccount(int id,Author author) {
		Author author1=authorRepo.findById(id).get();
		author1.setName(author.getName());
		author1.setGender(author.getGender());
		author.setCreatedAt(author.getCreatedAt());
		author1.setBook(author.getBook());
		
		authorRepo.save(author1);
		
		return ResponseEntity.ok().body("update succesfully");
						
	}


	@Override
	public ResponseEntity<?> deleteAccount(int id) {
	 authorRepo.deleteById(id);
	 return ResponseEntity.ok().body("delete Successfully");
	}
	
	
	

}
