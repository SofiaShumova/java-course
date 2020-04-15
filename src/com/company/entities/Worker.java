package com.company.entities;

import com.company.entities.Employee;

import java.util.Date;

public class Worker extends Employee {
    private  String workDepartment;
    private String position;

    public Worker(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Worker(String firstName, String lastName, Date dateBirthday, int wage, int experience,
                  boolean isHigherEducation, String workDepartment, String position) {
        super(firstName, lastName, dateBirthday, wage, experience, isHigherEducation);
        setWorkDepartment(workDepartment);
        setPosition(position);
    }

    public void setPosition(String position){
        this.position=position;
    }

    public String getPosition(){
        return position;
    }
    public void setWorkDepartment(String workDepartment){
        this.workDepartment = workDepartment;
    }
    public String getWorkDepartment(String workDepartment){
        return workDepartment;
    }
}
