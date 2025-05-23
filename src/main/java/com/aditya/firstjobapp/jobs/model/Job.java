package com.aditya.firstjobapp.jobs.model;

public class Job {
    private Long id;
    private String tittle;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    public Job(Long id, String tittle, String description, String minSalary, String maxSalary, String location) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.location = location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public String getLocation() {
        return location;
    }
}
