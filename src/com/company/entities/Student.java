package com.company.entities;

import com.company.entities.Person;

import java.util.Date;

public class Student extends Person {
    private static int counter;
    private int numberGroup;
    private int numberID;
    private String specialty;


    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        setNumberID();
    }
    public Student(String firstName, String lastName, Date dateBirth) {
        super(firstName, lastName, dateBirth);
        setNumberID();
    }
    public Student(String firstName, String lastName, int numberGroup ) {
        super(firstName, lastName);
        setNumberGroup(numberGroup);
        setNumberID();
    }
    public int getNumberGroup(){
        return numberGroup;
    }
    public int getNumberID(){
        return numberID;
    }
    public String getSpecialty(){
        return specialty;
    }

    public void setNumberGroup(int number){
        numberGroup=number;
    }

    private void setNumberID(){
        this.numberID = counter++;
    }
    public void setSpecialty(String name){
        specialty=name;
    }
    public String toString(){
        return getFirstName()+" "+ getLastName()+" "+getNumberID();
    }
}
