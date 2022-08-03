package com.example.RecrutExam.Services;

import java.util.Set;

import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set <Quiz>getQuizes();
	
	
	public Quiz getQuizById(Long id);
	
	public void deleteQuiz(Long id);
	
	
	
}
