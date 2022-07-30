package com.example.RecrutExam.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.RecrutExam.Entity.User;
import com.example.RecrutExam.Repositories.UserRepository;


@Service
public class UserDetailsServiceImp implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		
		User user = this.userRepo.findByUsername(username);		
		
		
		if(user == null) {
			
			System.out.println("User not found");
			throw new UsernameNotFoundException("No user found!");
			
		}
		
		return user;
	}

}
