package com.example.RecrutExam.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RecrutExam.Entity.Examen.Question;
import com.example.RecrutExam.Entity.Examen.Quiz;
import com.example.RecrutExam.Services.QuestionService;
import com.example.RecrutExam.Services.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuizService quizService;
	
	
	@Autowired
	private QuestionService questionService;
	
	
	
	@GetMapping("/{id}")
	public Question question (@PathVariable("id") Long id) {
		
		return this.questionService.getQuestionById(id);
		
	}
	
	
	
	
	@PostMapping("/")
	public ResponseEntity<Question> addQuestion(@RequestBody Question question){
		
		return ResponseEntity.ok(this.questionService.addQuestion(question));
		
		
	}
	
	
	
	@PutMapping("/")
	public ResponseEntity<Question>update(@RequestBody Question question){
		
		return ResponseEntity.ok(this.questionService.updateQuestion(question));
	
		
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?>questions(){
		
		return ResponseEntity.ok(this.questionService.getQuestions());
		
	}
	
	

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
			
		this.questionService.deleteQuestion(id);
		
	}
	
	
	
	
	@GetMapping("/quiz/{id}")
	public ResponseEntity<?>getQuestionOfQuiz(@PathVariable("id") Long id){
		
		
	/*	Quiz quiz = new Quiz();
		quiz.setId(qid);
		Set<Question>questionOfQuiz = this.questionService.getQuestionOfQuiz(quiz);
		return ResponseEntity.ok(questionOfQuiz);*/
		
		
		Quiz quiz = this.quizService.getQuizById(id);
		Set<Question> questions = quiz.getQuestions();
		
		List list = new ArrayList(questions);
		
		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestion())) {
			
			list = list.subList(0, Integer.parseInt(quiz.getNumberOfQuestion() + 1));
			
		}
		
		Collections.shuffle(list);
		return ResponseEntity.ok(list);
		
	}
	
	
	
	
	
	
	@GetMapping("/quiz/all/{id}")
	public ResponseEntity<?>getQuestionOfQuizAdmin(@PathVariable("id") Long id){
		
		
		Quiz quiz = new Quiz();
		quiz.setId(id);
		Set<Question>questionOfQuiz = this.questionService.getQuestionOfQuiz(quiz);
		return ResponseEntity.ok(questionOfQuiz);
		
		
	/*	Quiz quiz = this.quizService.getQuizById(id);
		Set<Question> questions = quiz.getQuestions();
		
		List list = new ArrayList(questions);
		
		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestion())) {
			
			list = list.subList(0, Integer.parseInt(quiz.getNumberOfQuestion() + 1));
			
		}
		
		Collections.shuffle(list);*/
		//return ResponseEntity.ok(list);
		
	}
	
	
	
	
}
