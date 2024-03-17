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
		
		//name
		if(author.getName()==null) {
			Error error=new Error("name","name is not null");
			errors.add(error);
		}
		//gender
		if(author.getGender()==null) {
			Error error=new Error("gender","name is not null");
			errors.add(error);
		}
		
		
		return errors;
	}
}
