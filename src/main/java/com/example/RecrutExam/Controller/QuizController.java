package com.example.RecrutExam.Controller;

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

import com.example.RecrutExam.Entity.Examen.Quiz;
import com.example.RecrutExam.Services.QuizService;

@RestController
@CrossOrigin("*")
@RequestMapping("/quiz")
public class QuizController {

	
	
	@Autowired
	private QuizService quizService;
	
	@GetMapping("/{id}")
	public Quiz quiz (@PathVariable("id") Long id) {
		
		return this.quizService.getQuizById(id);
		
	}
	
	
	
	@PostMapping("/")
	public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz quiz){
		
		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
		
		
	}
	
	
	
	@PutMapping("/")
	public ResponseEntity<Quiz>update(@RequestBody Quiz quiz){
		
		return ResponseEntity.ok(this.quizService.updateQuiz(quiz));
	
		
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?>quizzes(){
		
		return ResponseEntity.ok(this.quizService.getQuizes());
		
	}
	
	

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		
		this.quizService.deleteQuiz(id);
		
	}
	
	
	
	
	
}
