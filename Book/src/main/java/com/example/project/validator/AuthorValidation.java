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
		if(author.getName().isEmpty()|| author.getName().length()==0) {
			Error error=new Error("name","please send proper name.its empty");
			errors.add(error);
		}
		//gender
		if(author.getGender().isBlank()||author.getGender().length()==0) {
			Error error=new Error("gender","gender is blank please fill up");
			errors.add(error);
		}
		if(author.getCreatedAt()==null)
			errors.add(new Error("createdAt","Creation date is missing"));
		
		return errors;
	}
}
