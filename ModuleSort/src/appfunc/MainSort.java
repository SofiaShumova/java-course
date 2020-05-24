package appfunc;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainSort {
    public static ArrayList<String> ReadFile(String nameFile){
        ArrayList<String> students = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(nameFile);
            Scanner fileScan = new Scanner(fr);
            while (fileScan.hasNextLine()){
                String infoStudent[] = fileScan.nextLine().split(" ");
                students.add(infoStudent[0]+" "+infoStudent[1]+""+infoStudent[2]);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  students;
    }

    public static void WriteFile(ArrayList<String> array, String nameFile, PrintStream pw){
        try {
            FileWriter fw = new FileWriter(nameFile);
            for(int i =0; i<array.size(); i++){
                fw.write(array.get(i));
                fw.write("\n");
                pw.println("Записано: "+array.get(i) +" в " +nameFile);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void SortStudent(String nameFile, PrintStream ps){
        ArrayList<String> list = ReadFile(nameFile);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        WriteFile(list, "sort-"+nameFile, ps);
    }
}
