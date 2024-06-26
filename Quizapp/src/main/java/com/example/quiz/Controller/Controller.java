package com.example.quiz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.Entity.Question;
import com.example.quiz.Service.ServiceInterface;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	ServiceInterface service;
	
	
	@PostMapping("/postquestions")
	public Question createQuestions(@RequestBody Question question) {
		return service.createQuestion(question);
	}
	
	@GetMapping("/allquestions")
	public ResponseEntity<List<Question>> getAllquestions(){
		return new ResponseEntity<>(service.getAllQuestions(),HttpStatus.OK);
	}
	
	@GetMapping("/allquestions/category/{category}")
	public List<Question> getCategoryBased(@PathVariable String category){
		return service.getCategoryBased(category);
	}	

}
