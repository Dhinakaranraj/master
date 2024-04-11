package com.example.quiz.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.quiz.Entity.Question;
import com.example.quiz.Repository.QuestionRepository;

@Service
public class ServiceImplement implements ServiceInterface{
	
	@Autowired
	QuestionRepository qusRepo;

	@Override
	public List<Question> getAllQuestions() {
		try {
			return qusRepo.findAll();
		}catch (Exception e) {
			e.printStackTrace();
            throw new RuntimeException("Failed to retrieve questions from the database");
		}
		
	}

	@Override
	public Question createQuestion(Question question) {
		return qusRepo.save(question);
	}

	@Override
	public List<Question> getCategoryBased(String category) {
		return qusRepo.findByCategory(category);
	}

}
