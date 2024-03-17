package com.example.project.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.project.common.Error;
import com.example.project.entity.Author;

@Component
public class AuthorValidation {

	public List<Error>validCreateAuthor(Author author){
		
		List<Error>errors=new ArrayList<>();
		
		//Author name                                                                                                   //Author table
		if(author.getName().isEmpty()|| author.getName().length()==0) {
			Error error=new Error("name","authorName not empty or blank check it!");
			errors.add(error);
		}
		//gender
		if(author.getGender().isBlank()||author.getGender().length()==0) {
			Error error=new Error("gender","gender is blank please text");
			errors.add(error);
		}
		//createdAt
		if(author.getCreatedAt()==null) {
			errors.add(new Error("createdAt","Creation date is null"));
		}
		
		
		//Book name                                                                                                            //Book table
		if (author.getBook() != null && (author.getBook().getName() == null || author.getBook().getName().isBlank())) {
            errors.add(new Error("name", "bookName not empty or blank check it!"));
		}
		
		//YearOfPublication
        if (author.getBook() != null && author.getBook().getYearOfPublication() == null) {
            errors.add(new Error("yearOfPublication", "Year of publication cannot be null!"));  
        }
        
        //Description
        if(author.getBook()!=null &&(author.getBook().getDescription()==null || author.getBook().getDescription().isBlank())) {
        	errors.add(new Error("description","decription cannot be empty or null!"));
        }
        
        //Book type
        if(author.getBook().getBookType()!=null &&(author.getBook().getBookType()==null || author.getBook().getBookType().isBlank())) {
        	errors.add(new Error("bookType","Book type cannot be empty or null!"));
        }
		
        return errors;
        
	
	}
	
	
}
