package com.company;

import com.company.entities.LambdaExpression;
import com.company.entities.Person;
import com.company.entities.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            String type = "Student";
            Factory factory = new Factory();
            Person p = factory.getCurrentPerson(type, "Sofia", "Shumova");
//            System.out.println(p.toString());
//            System.out.println(p.getClass().getName());

        LambdaExpression.TestLambda(System.out);

    }
}
