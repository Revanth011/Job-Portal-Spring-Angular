package com.example.demo.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Jobs;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.perisistance.JobRepository;
import com.example.demo.perisistance.RoleRepository;
import com.example.demo.perisistance.UserRepository;

@Service
public class UserServiceImplementations implements UserServiceDeclarations {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private JobRepository jRepo;
	
	@Override
	@Transactional
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		User local = this.userRepository.findByUsername(user.getUsername());
		if (local != null) {
			System.out.println("User is Already there");
			throw new Exception("User already present ");
		}
		else {
			for(UserRole ur:userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);
		}
		
		return local;
	}

	@Override
	@Transactional
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}

	
	//Admin Side
	
	@Override
	@Transactional
	public List<Jobs> getAllJobs() {
		// TODO Auto-generated method stub
		return this.jRepo.findAll();
	}

	@Override
	@Transactional
	public void InsertJob(Jobs job) {
		// TODO Auto-generated method stub
		this.jRepo.save(job);
	}

	@Override
	@Transactional
	public void deleteJob(String jname) {
		// TODO Auto-generated method stub
		this.jRepo.deleteByJname(jname);
	}

}
