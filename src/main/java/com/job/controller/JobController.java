package com.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.job.entities.Job;
import com.job.repository.JobRepository;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
public class JobController {


		//mapping to create a new user
		@PostMapping("/jobs")
		public String createNewJob(@RequestBody Job job) {
		}
		//mapping to fetch all the users
		@GetMapping("/jobs")
		public List<Job> getAllJobs(){

		}
		//mapping to fetch a single user
		@GetMapping("/jobs/{jobId}")
		public Job getJobById(@PathVariable Long jobId){

		}

		//mapping to delete a user
		@DeleteMapping("/jobs/{jobId}")
		public String delJobById(@PathVariable Long jobId){
			String ans="DONE";
			return ans;
		}

}
