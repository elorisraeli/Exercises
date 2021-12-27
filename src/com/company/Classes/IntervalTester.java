package com.company.Classes;

public class IntervalTester {

    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(3, 4);
        Interval2 keta1 = new Interval2(p1, p2);

        System.out.println(keta1.toString()); // Try also: System.out.println(keta);  //why it also works?

        System.out.println("Keta Distance: " + keta1.intrLength());

        Point p = keta1.midPoint();
        System.out.println("Middle Point: " + p.toString()); // Try also: System.out.println("Middle Point: " + p);

        Interval2 keta2 = new Interval2(keta1); //create another keta, identical to keta1, using the copy constructor
        System.out.println(keta1.compareLength(keta2)); //will print 0 because they are identical
    }

}
