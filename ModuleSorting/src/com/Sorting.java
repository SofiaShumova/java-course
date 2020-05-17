package com;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting {
//    public static ArrayList<Student> ReadFile(String nameFile){
//        ArrayList<Student> students = new ArrayList<Student>();
//        try {
//            FileReader fr = new FileReader(nameFile);
//            Scanner fileScan = new Scanner(fr);
//            while (fileScan.hasNextLine()){
//                String infoStudent[] = fileScan.nextLine().split(" ");
//                students.add(new Student(infoStudent[0], infoStudent[1]));
//            }
//            fr.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return  students;
//    }
//    public static void WriteFile(ArrayList<Student> array , String nameFile, PrintStream pw){
//        try {
//            FileWriter fw = new FileWriter(nameFile);
//            for(int i =0; i<array.size(); i++){
//                fw.write(array.get(i).toString());
//                fw.write("\n");
//                pw.println("Записано: "+array.get(i).toString() +" в " +nameFile);
//            }
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void SortingStudent(String nameFile, PrintStream ps){
//        ArrayList<Student> students = ReadFile(nameFile);
//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });
//        WriteFile(students,"new_"+nameFile, ps);
        ps.print(nameFile);
    }

}
