package com.company.homework.Practice12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    Triangle t;

    @BeforeEach
    void init() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(4, 0);
        t = new Triangle(p1, p2, p3);
    }

    @Test
    void testArea() {
        assertEquals(8, t.area()); // its work, but show expected 8 and actual is 7.99999999...
    }

    @Test
    void testCircumference(){
        assertEquals(Math.sqrt(32)+4+4, t.circumference());
    }

    @Test
    void testContain(){
        Point p4 = new Point(0, 2);
        assertTrue(t.contain(p4));
    }

}
