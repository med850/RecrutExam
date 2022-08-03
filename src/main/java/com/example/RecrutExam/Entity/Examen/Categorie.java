package com.example.RecrutExam.Entity.Examen;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.RecrutExam.Entity.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="categorie")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String titre;
	
	
	private String description;
	
	@OneToMany(mappedBy="categorie", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Quiz>quizes = new LinkedHashSet<>(); 
	
	
	
}
