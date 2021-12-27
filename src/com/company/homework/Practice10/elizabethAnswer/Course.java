package com.company.homework.Practice10.elizabethAnswer;

public class Course {
    private final int CODE; //please note, because I decide to make this 'final' there was no need or meaning to make setter method for it.
    private String name;
    private double credits;
    private int grade;
    private boolean isTested = false;

    public Course(int CODE, String name, double credits) {
        this.CODE = CODE;
        setName(name);
        setCredits(credits);
    }

    public Course(Course course) {
        this(course.getCode(), course.getName(), course.getCredits()); //call the first constructor
    }

    public String toString() {
        return getName() + ", Code: " + getCode() + ", Credits: " + getCredits() + ", Grade: " + getGradeString();
    }

    private String getGradeString() {
        if (isTested)
            return "" + getGrade();
        else
            return "Not tested yet";
    }

    public boolean isTested() {
        return isTested;
    }

    public int getGrade() {
        return grade;
    }

    public boolean setGrade(int grade) {
        if (grade >= 0 && grade <= 100) //validate the grade
        {
            this.grade = grade;
            isTested = true;
            return true;
        }

        return false; //if the grade was invalid
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public int getCode() {
        return CODE;
    }
}
