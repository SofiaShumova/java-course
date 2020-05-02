package com.company.entities;

import java.util.Date;

public class Person {
    private String  lastName;
    private String  firstName;
    private Date dateBirthday;

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }
    public Person(String firstName, String lastName, Date dateBirthday){
        setFirstName(firstName);
        setLastName(lastName);
        setDateBirthday(dateBirthday);
    }

    public Person() {

    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
       if(!lastName.isEmpty()){
           this.lastName=lastName;
       }
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        if(!firstName.isEmpty()){
            this.firstName=firstName;
        }
    }

    public Date getDateBirth(){
        return dateBirthday;
    }
    public void setDateBirthday(Date date){
       dateBirthday=date;
    }

    public String toString(){
        return firstName+" "+lastName;
    }
}
