package com.company.entities;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LambdaExpression {
    interface SortingStudentsGroup {
        void sorting(ArrayList<Student> students, int numberGroup, PrintStream pw);
    }

    public static SortingStudentsGroup sortingStudentsGroup = (students, numberGroup, printWriter) -> {
        printWriter.println("Студенты, состоящие в " + numberGroup + " группе: ");
        for (Student student : students) {
            if (student.getNumberGroup() == numberGroup)
                printWriter.println(student.toString());
        }
    };
    public static SortingStudentsGroup sortingStudentsMoreGroup = (students, numberGroup, printWriter) -> {
        printWriter.println("Студенты, состоящие в " + numberGroup + " группе и номером больше: ");
        for (Student student : students) {
            if (student.getNumberGroup() >= numberGroup)
                printWriter.println(student.toString());
        }
    };
    public static SortingStudentsGroup sortingStudentsLessGroup = (students, numberGroup, printWriter) -> {
        printWriter.println("Студенты, состоящие в " + numberGroup + " группе и номером меньше: ");
        for (Student student : students) {
            if (student.getNumberGroup() <= numberGroup)
                printWriter.println(student.toString());
        }
    };

    public static void TestLambda(PrintStream pw) {
        sortingStudentsGroup.sorting(getListStudent(), 744, pw);
        sortingStudentsLessGroup.sorting(getListStudent(), 744, pw);
        sortingStudentsMoreGroup.sorting(getListStudent(), 744, pw);
    }

    public static ArrayList<Student> getListStudent() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Sofia", "Shumova", 744));
        students.add(new Student("Carl", "Durham", 687));
        students.add(new Student("Lawrence", "Meyers", 765));
        students.add(new Student("Wade", "Weeks", 744));
        students.add(new Student("Yvette", "Velasquez", 652));
        students.add(new Student("Samson", "Good", 765));
        students.add(new Student("Ulric", "Glover", 873));
        students.add(new Student("Mikhaleva", "Elizabeth", 744));
        return students;
    }
}

