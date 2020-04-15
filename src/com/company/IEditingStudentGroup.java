package com.company;

import com.company.entities.Student;

import java.util.ArrayList;

public interface IEditingStudentGroup {
    void addStudent(Student student);
    void removeStudent(Student student);
    ArrayList<Student> getStudents();
    void setHeadman(Student student);
    Student getHeadman();
}
