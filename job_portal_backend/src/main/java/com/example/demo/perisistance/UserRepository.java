package com.example.demo.perisistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;



public interface UserRepository extends JpaRepository<User ,Integer> {
	public User findByUsername(String username);
}
