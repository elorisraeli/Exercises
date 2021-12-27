package com.company.homework.Practice12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c1, c2;

    @BeforeEach
    void init(){
        Point p1 = new Point(0,0);
        c1 = new Circle(p1, 1);
        c2 = new Circle(p1, 2);
    }

    @Test
    void testCircumference(){
        assertEquals(2*Math.PI, c1.circumference());
        assertEquals(2*Math.PI*2, c2.circumference());
    }

    @Test
    void testArea(){
        assertEquals(Math.PI, c1.area());
        assertEquals(Math.PI * 4, c2.area());
    }

    @Test
    void testContain(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,2);
        assertTrue(c1.contain(p1)); // same as 'assertEquals(c1.contain(p1), true)'...
        assertFalse(c1.contain(p2));
    }
}
