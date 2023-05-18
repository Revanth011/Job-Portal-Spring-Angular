package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Applied;
import com.example.demo.entity.Jobs;
import com.example.demo.entity.Recruiter;
import com.example.demo.entity.User;
import com.example.demo.persistance.AppliedRepository;
import com.example.demo.persistance.JobsRepository;
import com.example.demo.persistance.RecruiterRepository;
import com.example.demo.persistance.UserRepository;

public class ServiceImplementations implements ServiceDeclarations{
	private AppliedRepository applied;
	private JobsRepository jobs;
	private RecruiterRepository recruiter;
	private UserRepository user;
	
	

	
	//User
	
	@Autowired
	public ServiceImplementations(AppliedRepository applied, JobsRepository jobs, RecruiterRepository recruiter,
			UserRepository user) {
		this.applied = applied;
		this.jobs = jobs;
		this.recruiter = recruiter;
		this.user = user;
	}


	@Override
	@Transactional
	public List<User> getAllUser() {
		List<User> ulist= user.findAll();
		return ulist;
	}

	
	@Override
	@Transactional
	public void insertUser(User u) {
		u.setUid(0);
		user.save(u);
		
	}

	@Override
	@Transactional
	public User updateUser(User u) {
		return user.save(u);
	}
//Recruiter
	
	@Override
	@Transactional
	public List<Recruiter> getAllRecruiter() {
		List<Recruiter> rlist= recruiter.findAll();
		return rlist;
	}

	@Override
	@Transactional
	public void insertRecruiter(Recruiter r) {
		r.setRid(0);
		recruiter.save(r);
		
	}

	@Override
	@Transactional
	public Recruiter updateRecruiter(Recruiter r) {
		return recruiter.save(r);
		
	}
//Jobs
	
	@Override
	@Transactional
	public List<Jobs> getAllJobs() {
		List<Jobs> jlist= jobs.findAll();
		return jlist;
	}

	@Override
	@Transactional
	public void insertJobs(Jobs j) {
		j.setJid(0);
		jobs.save(j);
		
	}

	@Override
	@Transactional
	public Jobs updateJobs(Jobs j) {
		return jobs.save(j);
		
	}

	@Override
	@Transactional
	public void deleteJobs(int jid) {
		jobs.deleteById(jid);
		
	}
//Applied
	
	@Override
	@Transactional
	public void insertAppliedJob(Applied a) {
		a.setAid(0);
		applied.save(a);
		
	}


	@Override
	public List<Applied> getAllAppliedJobs() {
		List<Applied> alist = applied.findAll();
		return alist;
	}
}
