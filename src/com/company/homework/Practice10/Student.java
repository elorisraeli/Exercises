package com.company.homework.Practice10;

import com.company.homework.Practice10.Course;

import java.util.Arrays;

public class Student {
    private String name;
    private int ID;
    private Course[] courses;

    public Student(String name, int id) {
        this.name = name;
        ID = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        int length = courses.length;
        Course[] arr_new = new Course[length + 1];
        arr_new[length + 1] = course;
        courses = arr_new;
    }

    public boolean updateGrade(int courseCode, int grade) {
        boolean exist = false;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getSerial_number() == courseCode) exist = true;
        }
        if (!exist) return false;
        if (grade > 100 || grade < 0) return false;
        else return true;
    }

    public double averageGrades() {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < courses.length; i++) {
            sum += courses[i].getGrade();
        }
        average = sum/courses.length;
        return average;
    }

    public String toString() {
        return "The student name is: " + name +
                ", with ID number: " + ID + "\'" +
                "His courses are: " + Arrays.toString(courses);
    }

}
