package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.job.service.jobServiceImpl;

import com.job.entities.Job;
import com.job.repository.JobRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api-v1")
public class JobController {

		@Autowired
		private jobServiceImpl JSI;

		@Autowired
		public JobController(jobServiceImpl JSI){
			this.JSI=JSI;
		}

		//mapping to create a new user
		@PostMapping("/jobs")
		public Job createNewJob(@RequestBody Job job) {
			Job newJob=JSI.makeJob(job);
			return newJob;
		}
		//mapping to fetch all the users
		@GetMapping("/jobs")
		public List<Job> getAllJobs(){
			return JSI.getAllJobs();
		}
		//mapping to fetch a single user
		@GetMapping("/jobs/{jobId}")
		public Optional<Job> getJobById(@PathVariable Long jobId){
			Optional<Job> newJob=JSI.getJobFromId(jobId);
			return newJob;
		}

		//mapping to delete a user
		@DeleteMapping("/jobs/{jobId}")
		public String delJobById(@PathVariable Long jobId){
			JSI.remJobFromId(jobId);
			String ans="DONE";
			return ans;
		}

}
