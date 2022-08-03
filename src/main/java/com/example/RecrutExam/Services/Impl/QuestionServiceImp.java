package com.example.RecrutExam.Services.Impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecrutExam.Entity.Examen.Question;
import com.example.RecrutExam.Entity.Examen.Quiz;
import com.example.RecrutExam.Repositories.QuestionRepository;
import com.example.RecrutExam.Services.QuestionService;


@Service
public class QuestionServiceImp implements QuestionService{

	@Autowired
	QuestionRepository QuestionRepo;
	
	
	
	@Override
	public Question addQuestion(Question question) {
		
		return QuestionRepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
	
		return QuestionRepo.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		
		return new HashSet<>(this.QuestionRepo.findAll());
	}

	@Override
	public Question getQuestionById(Long id) {
		
		return this.QuestionRepo.findById(id).get();
	}

	@Override
	public void deleteQuestion(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Question> getQuestionOfQuiz(Quiz quiz) {
		
		return this.QuestionRepo.findByQuiz(quiz);
	}

}
