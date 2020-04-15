package com.company.entities;

import com.company.entities.Employee;

import java.util.Date;

public class Teacher extends Employee {
    private String specialty;
    private String department;
    private String faculty;
    public Teacher(String firstName, String lastName){
        super(firstName, lastName);
    }
    public Teacher(String firstName, String lastName, Date dateBirthday, int wage, int experience, boolean isHigherEducation,
                   String specialty, String department, String faculty ) {
        super(firstName, lastName, dateBirthday, wage, experience, isHigherEducation);
        setDepartment(department);
        setFaculty(faculty);
        setSpecialty(specialty);
    }
    public String getSpecialty(){
        return specialty;
    }
    public String getDepartment(){
        return department;
    }
    public String getFaculty(){
        return faculty;
    }
    public void setSpecialty(String specialty){
        this.specialty=specialty;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setFaculty(String faculty){
        this.faculty=faculty;
    }
    public String toString(){
        return super.toString()+"\nTeacher speciality: "+getSpecialty();
    }
}
