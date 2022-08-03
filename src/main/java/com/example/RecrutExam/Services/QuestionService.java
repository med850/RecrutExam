package com.example.RecrutExam.Services;

import java.util.Set;

import com.example.RecrutExam.Entity.Examen.Question;
import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuestionService {

	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set <Question>getQuestions();
	
	
	public Question getQuestionById(Long id);
	
	public void deleteQuestion(Long id);
	
	public Set<Question>getQuestionOfQuiz(Quiz quiz);
	
	
}
