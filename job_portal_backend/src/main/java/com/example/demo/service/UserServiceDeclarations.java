package com.example.demo.service;

import java.util.List;
import java.util.Set;

import com.example.demo.entity.Jobs;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

public interface UserServiceDeclarations {

public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	public void deleteUser(int userId);
	
	//Admin side
	
	public List<Jobs> getAllJobs();
		
	public void InsertJob(Jobs job);
		
	public void deleteJob(String jname);
	
	
}
