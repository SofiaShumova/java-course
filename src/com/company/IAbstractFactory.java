package com.company;

import com.company.lab.abstractInterface.IStudent;
import com.company.lab.abstractInterface.ITeacher;
import com.company.lab.abstractInterface.IWorker;

public interface IAbstractFactory {
    IStudent getStudent();
    ITeacher getTeacher();
    IWorker getWorker();
}
