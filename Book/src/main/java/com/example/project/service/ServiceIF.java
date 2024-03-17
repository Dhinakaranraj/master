package com.example.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.common.APIResponse;
import com.example.project.entity.Author;
import com.example.project.entity.Book;

@Service
public interface ServiceIF {

	Author createAccount(Author author);

	List<Author> getAllAccounts(Set<String>gen,String nmae);

	Author getById(int id);



	ResponseEntity<?> updateAccount(int id, Author author);


	ResponseEntity<?> deleteAccount(int id);

	List<Book> getByRawQuery(Set<Integer> yop,String book);

	APIResponse getByBook(Set<String> bok);


}
