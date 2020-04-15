package com.company.entities;

import com.company.IEditingStudentGroup;
import com.company.entities.Student;

import java.util.ArrayList;

public class StudentGroup implements IEditingStudentGroup {
    private Student headman;
    private static int counter;
    private int number;
    private int countStudents;
    private ArrayList<Student> students;
    private String specialty;
    private String keySpecialty;

    public StudentGroup(String specialty, String keySpecialty){
        setNumber();
        initArrayStudents();
        setKeySpecialty(keySpecialty);
        setSpecialty(specialty);
    }
    private void initArrayStudents(){
        students = new ArrayList<Student>();
    }
    public int getNumber(){
        return  number;
    }
    public int getCountStudents(){
        return  students.size();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public ArrayList<Student> getStudents(){
        return  students;
    }

    @Override
    public void setHeadman(Student student) {
        this.headman = student;
    }

    @Override
    public Student getHeadman() {
        return headman;
    }

    public String getKeySpecialty() {
        return keySpecialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setKeySpecialty(String keySpecialty) {
        this.keySpecialty = keySpecialty;
    }

    private void setNumber() {
        this.number = counter++;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
