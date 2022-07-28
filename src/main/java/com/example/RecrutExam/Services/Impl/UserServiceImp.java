package com.example.RecrutExam.Services.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RecrutExam.Entity.User;
import com.example.RecrutExam.Entity.UserRole;
import com.example.RecrutExam.Repositories.RoleRepository;
import com.example.RecrutExam.Repositories.UserRepository;
import com.example.RecrutExam.Services.UserService;




@Service
public class UserServiceImp implements UserService{

	
	@Autowired
	private UserRepository userRepo;
	
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Override
	public User createUser(User user, Set<UserRole> userRole) throws Exception {

		User local = this.userRepo.findByUsername(user.getUsername());
		
		if(local!=null) {
			
			System.out.println("User déja existe");
			throw new Exception("User déja existe");
			
		}else {
			
			
			for(UserRole ur:userRole) {
				
				roleRepo.save(ur.getRole());
				
			}
			
			user.getUserRoles().addAll(userRole);
			local = this.userRepo.save(user);
		}
		
		return local;
	}

	@Override
	public User getUser(String username) {
		
		return this.userRepo.findByUsername(username);
	}

	@Override
	public void deleteUser(Long id) {
	
		this.userRepo.deleteById(id);
		
	}

}
