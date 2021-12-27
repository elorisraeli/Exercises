package com.company.homework.Pracrice11;

public class Student {
    private int ID;
    private String name;

    public Student(int id, String name) {
        this.ID = id;
        this.name = name;
    }

    public String toString() {
        return String.format("The student name is: %s, and his id number is: %s", name, ID);
    }

}
