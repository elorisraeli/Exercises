package com.company.main;

import java.util.ArrayList;
import java.util.List;

public class Euclid {

    // Driver Program
    public static void main(String[] args) {
//        euclid_expand();
        int a = MyConsole.readInt("Enter a:");
        int b = MyConsole.readInt("Enter b:");
        System.out.println(euclid(a,b));
    }

    public static int euclid(int a, int b) {
        if (b == 0) return a;
        return euclid(b, a % b);
    }

    public static void euclid_expand() {
        // Try to find the x,y of the d = (x*a + y*b) when we know d = Euclid(a,b)
        int a = MyConsole.readInt("Enter a:");
        int b = MyConsole.readInt("Enter b:");
        List<Integer> factors = new ArrayList<>();
        int d = euclid(a, b);
        int temp, counter;
        // Part A, find the factors and their numbers.
        while (a != d && b != 0) {
            counter = 0;
            // check how many times a could enter to b
            while (a - b >= 0) {
                a = a - b;
                counter++;
            }
            factors.add(counter);
            factors.add(a % b);
            // change the parameters to continue checking
            temp = a;
            a = b;
            b = temp % b;
        }
        System.out.println(factors);
        // Part B, combine everything and find the x,y
//        int[] xy = multies(factors);
    }

//    public static int[] multies(List<Integer> nums){
//
//    }



    public static void euclid_toString() {
        int a = MyConsole.readInt("Enter a:");
        int b = MyConsole.readInt("Enter b:");
        System.out.println(Euclid.euclid(a, b));
    }

}
