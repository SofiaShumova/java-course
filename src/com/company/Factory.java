package com.company;

import com.company.entities.Person;
import com.company.entities.Student;
import com.company.entities.Teacher;
import com.company.entities.Worker;

public class Factory {
    public Person getCurrentPerson(String namePerson, String firstName, String lastName){
        Person person = null;
        if(namePerson.equals("Student")){
            person = new Student(firstName, lastName);
        } else if(namePerson.equals("Worker")){
            person = new Worker(firstName,lastName);
        } else if(namePerson.equals("Teacher")){
            person = new Teacher(firstName,lastName);
        }
        return person;
    }
}
