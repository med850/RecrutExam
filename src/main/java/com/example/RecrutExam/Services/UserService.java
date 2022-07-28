package com.example.RecrutExam.Services;

import java.util.Set;

import com.example.RecrutExam.Entity.User;
import com.example.RecrutExam.Entity.UserRole;

public interface UserService {

	
	
	//Save user
	public User createUser(User user, Set<UserRole>userRole) throws Exception;
	
	
	
	//Get users by username
	public User getUser(String username);
	
	
	//delete user by id
	public void deleteUser(Long id);
	
}
