package com.aditya.firstjobapp.jobs.controller;

import com.aditya.firstjobapp.jobs.model.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class jobController {
    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobs;
    }
    @GetMapping("/dalla")
    public String findAl(){
        return "musambi ka juice pilado!!";
    }
}
