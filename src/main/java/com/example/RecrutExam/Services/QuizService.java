package com.example.RecrutExam.Services;

import java.util.List;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import com.example.RecrutExam.Entity.Examen.Categorie;
import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	
	public Quiz updateQuiz(Quiz quiz);
	
	public Set <Quiz>getQuizes();
	
	
	public Quiz getQuizById(Long id);
	
	public void deleteQuiz(Long id);
	
	
	public List<Quiz>getQuizOfCategorie(Categorie categorie);
	
	
	public List<Quiz> getActiveQuizzes();
	
	public List<Quiz> getAciveQuizzesOfCategorie(Categorie c);
	
	
}
