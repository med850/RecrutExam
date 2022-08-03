package com.example.RecrutExam.Repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecrutExam.Entity.Examen.Question;
import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long>{

	Set<Question> findByQuiz(Quiz quiz);

}
