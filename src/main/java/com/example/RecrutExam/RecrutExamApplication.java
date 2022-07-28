package com.example.RecrutExam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.RecrutExam"})
public class RecrutExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecrutExamApplication.class, args);
	}

}
