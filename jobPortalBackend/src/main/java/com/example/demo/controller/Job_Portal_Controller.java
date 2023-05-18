package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.ServiceImplementations;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class Job_Portal_Controller {

	private ServiceImplementations serimp;

    
   @Autowired
	public Job_Portal_Controller(ServiceImplementations serimp) {
		
		this.serimp = serimp;
	}
   
	@GetMapping("user")
    public List<User> displayAllUser(){
    	List<User> ulist= serimp.getAllUser();
    	return ulist;
    }
    @PostMapping("user")
    public void insertionUser(@RequestBody User u) {
    	serimp.insertUser(u);
    }

    @PutMapping("user")
    public User updationUser(@RequestBody User u) {
    	return serimp.updateUser(u);
    }
}
