package com.job.service;

import com.job.entities.Job;
import com.job.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class jobServiceImpl implements jobService {

    private JobRepository jobRepo;

    @Autowired
    public jobServiceImpl(JobRepository jobRepo){
    this.jobRepo=jobRepo;
    }

    @Override
    public Optional<Job> getJobFromId(Long id) {
        return jobRepo.findById(id);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    @Override
    public void remJobFromId(Long id) {
       jobRepo.deleteById(id);
    }

    @Override
    public Job makeJob(Job job) {
        return jobRepo.save(job);
    }
}
