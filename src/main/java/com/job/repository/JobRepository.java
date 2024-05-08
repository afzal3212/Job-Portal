package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.entities.Job;

public interface JobRepository extends JpaRepository<Job,Long> {
	
}
