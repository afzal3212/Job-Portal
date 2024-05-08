package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.entities.Job;
import com.job.repository.JobRepository;

@RestController
@RequestMapping("/api")
public class JobController {
		@Autowired
		JobRepository jobRepository;
		@PostMapping("/jobs")
		
		public String createNewJob(@RequestBody Job job) {
			jobRepository.save(job);
			return "Job Created";
			
		}
}
