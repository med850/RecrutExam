package com.example.RecrutExam.Services.Impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecrutExam.Entity.Examen.Categorie;
import com.example.RecrutExam.Entity.Examen.Quiz;
import com.example.RecrutExam.Repositories.QuizRepository;
import com.example.RecrutExam.Services.QuizService;



@Service
public class QuizServiceImp implements QuizService{

	
	@Autowired
	private QuizRepository quizRepo;
	
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
	
		return this.quizRepo.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		return this.quizRepo.save(quiz);

	}

	@Override
	public Set<Quiz> getQuizes() {
		
		return new HashSet<>(this.quizRepo.findAll());
	}

	@Override
	public Quiz getQuizById(Long id) {
		
		return this.quizRepo.findById(id).get();
	}

	@Override
	public void deleteQuiz(Long id) {
		
		/*Quiz quiz  = new Quiz();
		
		quiz.setId(id);*/
		
		this.quizRepo.deleteById(id);
		
	}

	@Override
	public List<Quiz> getQuizOfCategorie(Categorie categorie) {
		
		return quizRepo.findByCategorie(categorie);
	}

	@Override
	public List<Quiz> getActiveQuizzes() {
		
		return this.quizRepo.findByActive(true);
	}

	@Override
	public List<Quiz> getAciveQuizzesOfCategorie(Categorie c) {
		
		return this.quizRepo.findByCategorieAndActive(c, true);
	}

}
