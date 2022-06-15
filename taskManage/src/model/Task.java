/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Task {
    private int id ;
    private String name;
    private String taskType;
    private String date;   
    private String planForm;
    private String planTo;
    private String assginee;    
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, String taskType, String date, String planForm, String planTo, String assginee, String reviewer) {
        this.id = id;
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.planForm = planForm;
        this.planTo = planTo;
        this.assginee = assginee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlanForm() {
        return planForm;
    }

    public void setPlanForm(String planForm) {
        this.planForm = planForm;
    }

    public String getPlanTo() {
        return planTo;
    }

    public void setPlanTo(String planTo) {
        this.planTo = planTo;
    }

    public String getAssginee() {
        return assginee;
    }

    public void setAssginee(String assginee) {
        this.assginee = assginee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

 
}
