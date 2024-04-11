package com.example.quiz.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.Entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);
}
