package com.company.homework.Practice10.elizabethAnswer;

import com.company.homework.Practice10.elizabethAnswer.Course;

public class Student {
    private String name;
    private final int ID;
    private Course[] courses = new Course[2]; //please note, this does not initialize the array with courses. It's just makes a place to HOLD two courses. The decision to make it in size 2 was arbitrary.
    private int coursesCounter = 0;

    public Student(String name, int id) {
        setName(name);
        ID = id;
    }

    public boolean updateGrade(int courseCode, int grade) {
        for (int i = 0; i < coursesCounter; i++) {
            if (courses[i].getCode() == courseCode) //if we found the course
            {
                if (courses[i].setGrade(grade)) //if the grade was valid
                {
                    return true;
                }
            }
        }

        return false; //we didn't found the course
    }

    public double getGradesAverage() {
        int sum = 0;
        double creditsCounter = 0;

        for (int i = 0; i < coursesCounter; i++) {
            if (courses[i].isTested()) {
                sum += (courses[i].getGrade() * courses[i].getCredits());
                creditsCounter += courses[i].getCredits();
            }
        }

        if (creditsCounter == 0) //to make sure we will not divide by 0
            return 0;
        else
            return sum / creditsCounter;
    }

    public void addCourse(Course course) {
        rescale();
        courses[coursesCounter++] = new Course(course); //deep copy!!
    }

    private void rescale() {
        if (coursesCounter == courses.length) //if the array is full, then need to resize
        {
            Course[] temp = new Course[courses.length * 2];

            for (int i = 0; i < coursesCounter; i++) {
                temp[i] = courses[i];
            }

            courses = temp;
        }
    }

    public String toString() {
        return "Name: " + getName() + ", ID: " + getID() + getCoursesString();
    }

    private String getCoursesString() {
        if (coursesCounter == 0)
            return "(no courses)";

        String coursesString = "\nCourses:";

        for (int i = 0; i < coursesCounter; i++) {
            coursesString += "\n" + courses[i];
        }

        return coursesString;
    }

    public int getCoursesCounter() {
        return coursesCounter;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
