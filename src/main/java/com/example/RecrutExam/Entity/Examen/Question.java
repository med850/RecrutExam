package com.example.RecrutExam.Entity.Examen;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="question")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Question {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 5000)
	private String content;
	
	private String image;
	
	private String op1;
	
	private String op2;
	
	private String op3;
	
	private String op4;
	
	private String reponse;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;
	
	
}
