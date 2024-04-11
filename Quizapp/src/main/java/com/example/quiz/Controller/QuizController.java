package com.example.quiz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.Entity.QuestionWrapper;
import com.example.quiz.Entity.Response;
import com.example.quiz.Service.QuizService;



@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	QuizService QuService;

	@PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return QuService.createQuiz(category, numQ, title);
    }
	
	@GetMapping("/get/{id}")
	public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(@PathVariable int id){
		return QuService.getQuizQuestions(id);
	}
	
	@PostMapping("/submit/{id}")
		public ResponseEntity<Integer>submitQuiz(@PathVariable int id, @RequestBody List<Response> responses){
			return QuService.submitQuiz(id,responses);
		}
	}

	

