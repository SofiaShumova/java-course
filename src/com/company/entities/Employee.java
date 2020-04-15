package com.company.entities;

import java.util.Date;

public class Employee extends Person {
    private int wage;
    private int experience;
    private boolean isHigherEducation;

    public Employee(String firstName, String lastName){
        super(firstName,lastName);
    }

    public Employee(String firstName, String lastName, Date dateBirthday, int wage, int experience, boolean isHigherEducation) {
        super(firstName, lastName, dateBirthday);
        setExperience(experience);
        setWage(wage);
        setHigherEducation(isHigherEducation);
    }

    public int getExperience(){
        return experience;
    }
    public boolean isHigherEducation(){
        return isHigherEducation;
    }
    public int getWage(){
        return  wage;
    }
    public void setWage(int wage){
        this.wage=wage;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }
    public void setHigherEducation(boolean value){
        isHigherEducation=value;
    }
}
