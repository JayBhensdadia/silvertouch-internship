package com.jaybhensdadia.hrms.service;

import com.jaybhensdadia.hrms.entity.Job;
import com.jaybhensdadia.hrms.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Job> fetchAllJobs() {
        return this.jobRepository.findAll();
    }

    @Override
    public Job fetchById(Long id) {
        return this.jobRepository.findById(id).get();
    }

    @Override
    public void saveJob(Job job) {
        this.jobRepository.save(job);
    }

    @Override
    public void deleteJob(Long id) {
        this.jobRepository.deleteById(id);
    }

}
