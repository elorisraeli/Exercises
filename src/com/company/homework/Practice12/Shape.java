package com.company.homework.Practice12;

public interface Shape {

    final double xOriging = 0;
    final double yOriging = 0;

    // לחשב את ההיקף
    public double circumference();

    // לחשב את השטח
    public double area();

    public boolean contain(Point p);
}
