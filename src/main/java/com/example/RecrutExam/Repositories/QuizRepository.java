package com.example.RecrutExam.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecrutExam.Entity.Examen.Categorie;
import com.example.RecrutExam.Entity.Examen.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

	
	public List<Quiz>findByCategorie(Categorie categorie);
	
	
	public List<Quiz>findByActive(Boolean b);
	
	public List<Quiz>findByCategorieAndActive(Categorie c, Boolean b);



}
