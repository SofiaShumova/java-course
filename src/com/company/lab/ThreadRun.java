package com.company.lab;

import com.company.DynamicArray;
import com.company.entities.Person;
import com.company.entities.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreadRun {
    public static void Work(){
        PrintWriter pw = new PrintWriter(System.out, true);
        Scanner scanner = new Scanner(System.in);
        //OutputStudents(ReadFile("out.txt", pw, scanner), pw);
        DynamicArray<Student> array = new DynamicArray<Student>((Class<Student>) new Person("","").getClass());
        array.ReadFile("out.txt");
        array.getInfo(pw);
    }
    public static void WriteFile(String nameFile, PrintWriter pw, Scanner s){
        ArrayList<Student> array = GetArrayStudent(pw,s);
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
    public static ArrayList<Student> GetArrayStudent(PrintWriter pw, Scanner s){
        pw.println("Введите количество вводимых данных:");
        int count = s.nextInt();
        String fname, lname;
        ArrayList<Student> students = new ArrayList<Student>();
        for(int i =0;i<count; i++){
            pw.println(i+1+" студент.");
            pw.println("Введите имя студента:");
            fname= s.next();
            pw.println("Введите фамилию студента:");
            lname= s.next();
            students.add(new Student(fname, lname));
        }
        return students;
    }
    public static ArrayList<Student> ReadFile(String nameFile, PrintWriter pw, Scanner s){
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            FileReader fr = new FileReader(nameFile);
            Scanner fileScan = new Scanner(fr);
            while (fileScan.hasNextLine()){
                String infoStudent[] = fileScan.nextLine().split(" ");
                students.add(new Student(infoStudent[0], infoStudent[1]));
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  students;
    }
    public static void OutputStudents(ArrayList<Student> arr, PrintWriter pw){
        for(int i =0; i<arr.size(); i++){
            pw.println(arr.get(i).toString());
        }
    }
}
