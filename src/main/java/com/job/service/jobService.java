package com.job.service;

import com.job.entities.Job;

import java.util.List;
import java.util.Optional;

public interface jobService {

    Optional<Job> getJobFromId(Long id);

    List<Job> getAllJobs();

    void remJobFromId(Long id);

    Job makeJob(Job job);
}
