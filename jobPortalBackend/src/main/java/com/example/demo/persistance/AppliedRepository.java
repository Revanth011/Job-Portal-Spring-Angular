package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Applied;

public interface AppliedRepository extends JpaRepository<Applied, Integer> {

}
