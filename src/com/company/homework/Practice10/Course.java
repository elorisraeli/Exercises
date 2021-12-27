package com.company.homework.Practice10;

public class Course {
    private int serial_number;
    private String name;
    private double points;
    private int grade;

    public Course(int serial_number, String name, double points) {
        this.serial_number = serial_number;
        this.name = name;
        this.points = points;
    }

    public int getSerial_number() {
        return serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "serial_number=" + serial_number +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
