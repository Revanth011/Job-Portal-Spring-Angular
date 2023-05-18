package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.entity.Jobs;
import com.example.demo.entity.Role;
import com.example.demo.service.UserServiceDeclarations;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserServiceDeclarations userService;
	@PostMapping("/")
	public User createuser(@RequestBody User user) throws Exception {
		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleid(11L);
		role.setRolename("Normal");
		
		UserRole userRole= new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		return this.userService.createUser(user,roles );
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username" ) String username) {
		return this.userService.getUser(username);
		
	}	
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") int userId) {
		this.userService.deleteUser(userId);
	}
	
	@GetMapping("job")
	public List<Jobs> getDetailsJob()
	{
		return this.userService.getAllJobs();
	}
	
	@PostMapping("job")
	public void insertJob(@RequestBody Jobs job)
	{
	   this.userService.InsertJob(job);
	}
	
	@DeleteMapping("job/{delete}")
	public void deleteJob( @PathVariable("delete") String jname)
	{
		this.userService.deleteJob(jname);
	}
}
