package com.company.homework.Practice12;

public class Triangle implements Shape{

    Point p1, p2, p3;
    Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double circumference() {
        return distance(p1, p2) + distance(p1, p3) + distance(p2, p3);
    }

    @Override
    public double area() {
        double a = (distance(p1, p2));
        double b = (distance(p1, p3));
        double c = (distance(p2, p3));
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public boolean contain(Point p) {
        double s = area();
        Triangle t1 = new Triangle(p, p1, p2);
        Triangle t2 = new Triangle(p, p2, p3);
        Triangle t3 = new Triangle(p, p1, p3);
        double areas =  t1.area() + t2.area() + t3.area();
        return areas <= s;
    }

    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getxVal() - p2.getxVal() , 2) + Math.pow(p1.getyVal() - p2.getyVal() , 2));
    }
}
