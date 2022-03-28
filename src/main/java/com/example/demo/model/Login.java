package com.example.demo.model;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Login {

    private String Application;
    private String AppAccountName;
    private String IsActive;
    private String JobTitle;
    private String Department;

    public Login() {}

    public Login(String application, String appAccountName, String isActive, String jobTitle, String department) {
        this.Application = application;
        this.AppAccountName = appAccountName;
        this.IsActive = isActive;
        this.JobTitle = jobTitle;
        this.Department = department;
    }

    public void fromMap(Map<String, String> map) {
        new Login(
                Application = map.get("Application"),
                AppAccountName = map.get("AppAccountName"),
                IsActive = map.get("IsActive"),
                JobTitle = map.get("JobTitle"),
                Department = map.get("Department")
            );
    }

    public String getApplication() {
        return Application;
    }

    public void setApplication(String application) {
        Application = application;
    }

    public String getAppAccountName() {
        return AppAccountName;
    }

    public void setAppAccountName(String appAccountName) {
        AppAccountName = appAccountName;
    }

    public String getActive() {
        return IsActive;
    }

    public void setActive(String active) {
        IsActive = active;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    @Override
    public String toString() {
        return "Login{" +
                "Application='" + Application + '\'' +
                ", AppAccountName='" + AppAccountName + '\'' +
                ", IsActive='" + IsActive + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
