package com.example.RecrutExam.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RecrutExam.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	
	
	public User findByUsername(String username);
	
}
