package com.company.Ex1;

import com.company.main.MyConsole;

public class EX1_A {
    public static void main(String[] args) {
        System.out.println("The program will check the spaces (m) between prime numbers until a number (n)");
        int n = MyConsole.readInt("Enter a number to see all prime numbers below him (n): ");
        int m = MyConsole.readInt("Enter a number space between prime numbers (m): ");
        prime_gap(n, m);
    }

    public static void prime_gap(int max, int space) {
        // for all the numbers beside 2
        int counter, x;
        for (int i = 3, j = space + 3; j < max; j++, i++) {
            counter = 0;
            for (x = 2; x < i; x++) {
                if (i % x == 0 || j % x == 0 || j % i == 0)
                    counter += 1;
            }
            if (counter == 0)
                System.out.println("(" + i + ", " + j + ")");
        }
        // just for options with the number 2
        counter = 0;
        int s = (2 + space);
        for (int i = 2; i < s; i++) {
            if (s % i == 0)
                counter += 1;
        }
        if (counter == 0)
            System.out.println("(" + 2 + ", " + s + ")");
    }
}
