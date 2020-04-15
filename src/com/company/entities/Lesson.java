package com.company.entities;

import java.util.Date;

public class Lesson{
    private Discipline discipline;
    private String type;
    private String topic;
    private Date date;
    private Teacher teacher;
    private StudentGroup studentGroup;

    public Lesson(Discipline discipline, String type, String topic, Date date, Teacher teacher, StudentGroup studentGroup){
        setDiscipline(discipline);
        setType(type);
        setTopic(topic);
        setDate(date);
        setTeacher(teacher);
        setStudentGroup(studentGroup);
    }

    public Date getDate() {
        return date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public String getTopic() {
        return topic;
    }

    public String getType() {
        return type;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setType(String type) {
        this.type = type;
    }
}
