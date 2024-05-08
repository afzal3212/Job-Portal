package com.job.service;

import com.job.entities.Job;

import java.util.List;

public interface jobService {

    Job getJobFromId(Long id);

    List<Job> getAllJobs();

    String remJobFromId(Long id);

    String makeJob(Job job);
}
