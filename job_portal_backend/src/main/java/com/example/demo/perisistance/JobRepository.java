package com.example.demo.perisistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Jobs;

public interface JobRepository extends JpaRepository<Jobs, Integer> {

	public void deleteByJname(String jname);

}
