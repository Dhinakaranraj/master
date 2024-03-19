package com.example.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.common.APIResponse;
import com.example.project.common.UserNotFoundException;
import com.example.project.entity.Author;
import com.example.project.entity.Book;

@Service
public interface ServiceIF {

	Author createAccount(Author author);

	List<Author> getAllAccounts(Set<String>gen,String nmae);

	Author getById(int id) throws UserNotFoundException;

	ResponseEntity<?> updateAccount(int id, Author author);


	ResponseEntity<?> deleteAccount(int id);

	List<Book> getByRawQuery(Set<Integer> yop,String book);

	APIResponse getByBook(Set<String> bok);

	APIResponse getException(Integer num);

	List<Book> getByPaginationField(String field);

	 Page<Author> getByPagination(int offset, int pageSize);

	Page<Author> getByPaginationWithSort(int offset, int pageSize, String field);


}
