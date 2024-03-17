package com.example.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.common.APIResponse;
import com.example.project.data.BookData;
import com.example.project.entity.Author;
import com.example.project.entity.Book;
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
	public List<Author> getAllAccounts(Set<String>gen,String name) {
		if(gen==null) {
			return authorRepo.findAll();
		}else {
			return authorRepo.findAllByGenderInAndName(gen,name);
		}
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

	@Override
	public List<Book> getByRawQuery(Set<Integer> yop,String book) {
		return bookRepo.findAllByYearOfPublicationAndBookType(yop,book);
	}

	@Override
	public APIResponse getByBook(Set<String> bok) {
		
		APIResponse apiResponse=new APIResponse();
		
		//db call
		List<Book> booklist=bookRepo.findAllByBookTypeIn(bok);

        //set data
		BookData bookData=new BookData();
		bookData.setBooks(booklist);
		
		//set  api response
		apiResponse.setData(bookData);
		
		return apiResponse;
	}

	
	

}
