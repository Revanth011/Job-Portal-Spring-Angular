package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Applied;
import com.example.demo.entity.Jobs;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.User;

public interface ServiceDeclarations {
	//User
	
	public List<User> getAllUser();

	public void insertUser(User u);

	public User updateUser(User u);

	//Recruiter

	public List<Recruiter> getAllRecruiter();

	public void insertRecruiter(Recruiter r);

	public Recruiter updateRecruiter(Recruiter r);

	//Jobs

	public List<Jobs> getAllJobs();

	public void insertJobs(Jobs j);

	public Jobs updateJobs(Jobs j);

	public void deleteJobs(int jid);

	//Applied
	public List<Applied> getAllAppliedJobs();

	public void insertAppliedJob(Applied a);
}
