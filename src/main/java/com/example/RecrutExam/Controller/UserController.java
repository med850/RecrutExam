package com.example.RecrutExam.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RecrutExam.Entity.Role;
import com.example.RecrutExam.Entity.User;
import com.example.RecrutExam.Entity.UserRole;
import com.example.RecrutExam.Services.UserService;
import com.example.RecrutExam.Helper.UserFoundException;
import com.example.RecrutExam.Helper.UserNotFoundException;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		
		
		
		user.setProfile("default.png");
		
		
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		
		Set<UserRole>roles = new HashSet<>();
		
		Role role = new Role();
		
		role.setRoleId(45L);
		
		role.setRoleName("NORMAL");
		
		
		UserRole userRole = new UserRole();
		
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
		
	}
	
	
	
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username")String username) {
		
		return this.userService.getUser(username);
		
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		
		this.userService.deleteUser(id);
		
	}
	
	
	
	@ExceptionHandler(UserFoundException.class)
	public ResponseEntity<?>exceptionHandler(UserFoundException ex){
		
		
	return null;	
		
	}
	
	
	
}
