package com.company;

import com.company.entities.Student;
import com.company.entities.Teacher;
import com.company.entities.Worker;
import com.company.lab.abstractInterface.IStudent;
import com.company.lab.abstractInterface.ITeacher;
import com.company.lab.abstractInterface.IWorker;

public class AbstractFactory implements IAbstractFactory {

    public AbstractFactory(){

    }
    @Override
    public IStudent getStudent() {
        return new Student();
    }

    @Override
    public ITeacher getTeacher() {
        return new Teacher();
    }

    @Override
    public IWorker getWorker() {
        return new Worker();
    }

    public void Test(){
        IAbstractFactory factory = new AbstractFactory();
        IStudent student = factory.getStudent();
        System.out.println(student.getNumberID());
    }
}
