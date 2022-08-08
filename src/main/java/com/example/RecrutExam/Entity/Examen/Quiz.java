package com.example.RecrutExam.Entity.Examen;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="quiz")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String titre;
	
	@Column(length = 5000)
	private String description;
	
	
	private String maxMarks;
	
	
	private String numberOfQuestion;
	
	
	private boolean active = false;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Categorie categorie;
	
	
	@OneToMany(mappedBy="quiz", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Question>questions = new HashSet<>();
	
	
	public Set<Question>getQuestions(){
		
		return questions;
		
	}
	
	
	public void setQuestion(Set<Question> question) {
		
		this.questions = questions;
		
	}
	
}
