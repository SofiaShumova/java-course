package com.company;

import appfunc.MainSort;
import com.company.entities.Person;
import com.company.entities.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        WriteFile(getListStudent(), "out.txt", System.out);
        MainSort.SortStudent("out.txt", System.out);
    }
    public static void WriteFile(ArrayList<Student> array, String nameFile, PrintStream pw){
        try {
            FileWriter fw = new FileWriter(nameFile);
            for(int i =0; i<array.size(); i++){
                fw.write(array.get(i).toString());
                fw.write("\n");
                pw.println("Записано: "+array.get(i).toString() +" в " +nameFile);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        students.add(new Student("Elizabeth", "Mikhaleva", 744));
        return students;
    }
}
