package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Jobs;

public interface JobsRepository extends JpaRepository<Jobs, Integer> {

}
