package com.example.project.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.project.common.APIResponse;
import com.example.project.common.BadRequestException;
import com.example.project.common.Error;
import com.example.project.common.UserNotFoundException;
import com.example.project.data.BookData;
import com.example.project.entity.Author;
import com.example.project.entity.Book;
import com.example.project.repository.AuthorRepository;
import com.example.project.repository.BookRepository;
import com.example.project.validator.AuthorValidation;

@Service
public class ServiceImple implements ServiceIF {
	@Autowired
	AuthorRepository authorRepo;
	
	@Autowired
	BookRepository bookRepo;

	@Autowired
	AuthorValidation authorValid;
	
	@Override
	public Author createAccount(Author author) {
		
		//validation
		List<Error> errors= authorValid.validCreateAuthor(author);
		
		//if not success
		if(errors.size()>0) {
			throw new BadRequestException(" bad request",errors);
		}
		
		
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
	public Author getById(int id) throws UserNotFoundException {
		Author author= authorRepo.findById(id).orElse(null);
		if(author!=null) {
			return author;
		}else {
			throw new UserNotFoundException("User Id "+id+" not found your database");
		}
		
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

	@Override
	public APIResponse getException(Integer num) {
		
		int result=100/num;
		APIResponse apirespond=new APIResponse();
		apirespond.setData(result);
		return apirespond;

	}

	@Override
	public List<Book> getByPaginationField(String field) {
	 return bookRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	@Override
	public Page<Author> getByPagination(int offset, int pageSize) {
		Page<Author> authorpage=authorRepo.findAll(PageRequest.of(offset, pageSize));
		return authorpage;
		
	}

	@Override
	public Page<Author> getByPaginationWithSort(int offset, int pageSize, String field) {
		Page<Author> authorpage=authorRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
		return authorpage;

	}

	@Override
	public Page<Book> getByPageSort(int offset, int pageSize, String field) {
		return bookRepo.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(Sort.Direction.ASC,field)));
	}

	
	

}
