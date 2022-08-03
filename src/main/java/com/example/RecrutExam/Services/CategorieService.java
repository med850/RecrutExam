package com.example.RecrutExam.Services;

import java.util.Set;

import com.example.RecrutExam.Entity.Examen.Categorie;

public interface CategorieService {

	public Categorie addCategorie(Categorie categorie);
	
	public Categorie updateCategorie(Categorie categorie);
	
	public Set<Categorie>getCategories();
	
	public Categorie getCategorie(Long id);
	
	public void deleteCategorie(Long id);
	
	
	
}
