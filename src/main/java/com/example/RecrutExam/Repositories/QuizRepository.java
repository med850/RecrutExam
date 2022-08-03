package com.example.RecrutExam.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
