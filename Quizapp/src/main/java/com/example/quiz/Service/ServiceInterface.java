package com.example.quiz.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.quiz.Entity.Question;

@Service
public interface ServiceInterface {

	List<Question> getAllQuestions();

	Question createQuestion(Question question);

	List<Question> getCategoryBased(String category);

}
