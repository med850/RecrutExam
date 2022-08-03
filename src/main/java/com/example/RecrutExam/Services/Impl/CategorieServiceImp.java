package com.example.RecrutExam.Services.Impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecrutExam.Entity.Examen.Categorie;
import com.example.RecrutExam.Repositories.CategorieRepository;
import com.example.RecrutExam.Services.CategorieService;


@Service
public class CategorieServiceImp implements CategorieService{

	
	@Autowired
	private CategorieRepository catRepo;
	
	
	
	@Override
	public Categorie addCategorie(Categorie categorie) {
				return this.catRepo.save(categorie);
	}

	@Override
	public Categorie updateCategorie(Categorie categorie) {
		return this.catRepo.save(categorie);
	}

	@Override
	public Set<Categorie> getCategories() {
		return new LinkedHashSet<>(this.catRepo.findAll());
	}

	@Override
	public Categorie getCategorie(Long id) {
		return this.catRepo.findById(id).get();
	}

	@Override
	public void deleteCategorie(Long id) {

		Categorie cat = new Categorie();
		cat.setId(id);
		this.catRepo.delete(cat);
		
		
	}

}
