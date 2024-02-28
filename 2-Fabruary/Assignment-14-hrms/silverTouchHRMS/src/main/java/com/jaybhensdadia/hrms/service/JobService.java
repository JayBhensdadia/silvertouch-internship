package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Job;

import java.util.List;

public interface JobService {
    public List<Job> fetchAllJobs();

    public Job fetchById(Long id);

    public void saveJob(Job job);

    public void deleteJob(Long id);

}
