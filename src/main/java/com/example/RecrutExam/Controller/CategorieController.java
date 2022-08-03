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

import com.example.RecrutExam.Entity.Examen.Categorie;
import com.example.RecrutExam.Services.CategorieService;

@RestController
@RequestMapping("/categorie")
@CrossOrigin("*")
public class CategorieController {

	
	@Autowired
	CategorieService catService;
	
	
	@PostMapping("/")
	public ResponseEntity<?>addCategorie(@RequestBody Categorie cat){
		Categorie cat1 = this.catService.addCategorie(cat);
		return ResponseEntity.ok(cat1);
	
	}
	
	
	
	@GetMapping("/{categorieId}")
	public Categorie getCategorie(@PathVariable("categorieId") Long categorieId) {
		
		
		return this.catService.getCategorie(categorieId);
		
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?>getAllCat(){
		return ResponseEntity.ok(this.catService.getCategories());
	}
	
	
	@PutMapping("/")
	public Categorie updateCategorie(@RequestBody Categorie cat) {
		
		return this.catService.updateCategorie(cat);
		
	}
	
	
	@DeleteMapping("/{categorieId}")
	public void deleteCategorie(@PathVariable("categorieId") Long categorieId) {
		
		
		
		
		
	}
	
	
	
	
}
