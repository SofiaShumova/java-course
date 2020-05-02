package com.company;

import com.company.entities.Person;

public class Main {

    public static void main(String[] args) {
            String type = "Student";
            Factory factory = new Factory();
            Person p = factory.getCurrentPerson(type, "Sofia", "Shumova");
            System.out.println(p.toString());
            System.out.println(p.getClass().getName());

            AbstractFactory abstractFactory = new AbstractFactory();
            abstractFactory.Test();
    }
}
