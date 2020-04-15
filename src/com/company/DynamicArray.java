package com.company;

import com.company.entities.Person;
import com.company.entities.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray<T extends Person> {

    T[] array;
    int count;

    public DynamicArray(Class<T> data){
        count=0;
        array = (T[]) Array.newInstance(data, 100);
    }
    public void addItem(T item){
        array[count] = item;
        count++;
    }
    public int getCount(){
        return count;
    }
    public void getDublicate(PrintWriter pw){
    for (int i =0 ;i<count;i++){
        for (int j =0 ;j<count;j++){
            if(i!=j && array[i].equals(array[j])){
                pw.println(i+". "+array[i].toString());
            }
        }
    }
    }
    public  void getInfo(PrintWriter pw){
        for (int i =0 ;i<count;i++){
            pw.println(array[i].toString());
        }
    }
    public T[] getArray(){
        return  array;
    }
    public T[] ReadFile(String nameFile){
        try {
            FileReader fr = new FileReader(nameFile);
            Scanner fileScan = new Scanner(fr);
            while (fileScan.hasNextLine()){
                String infoPerson[] = fileScan.nextLine().split(" ");
                this.addItem((T) new Person(infoPerson[0], infoPerson[1]));
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  array;
    }

}
