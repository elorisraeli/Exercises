package com.company.homework.Practice12;

public class Circle implements Shape{

    private Point center;
    private double radius;

    public Circle(Point p, double rad){
        this.center = new Point(p.getxVal(), p.getyVal());
        this.radius = rad;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean contain(Point p) {
        double dis = distance(center, p);
        return dis <= radius;
    }

    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getxVal() - p2.getxVal() , 2) + Math.pow(p1.getyVal() - p2.getyVal() , 2));
    }
}
