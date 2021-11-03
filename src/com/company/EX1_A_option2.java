package com.company;

public class EX1_A_option2 {
    public static void EX1_A_o2() {
        System.out.println("The program will check the spaces (m) between prime numbers until a number (n)");
        int n = MyConsole.readInt("Enter a number to see all prime numbers below him (n): ");
        int m = MyConsole.readInt("Enter a number space between prime numbers (m): ");
        int c, x;
        for (int i=3, j=m+3; j<n; j++, i++){
            c=0;
            for (x=2;x<i;x++) {
                if (i % x == 0 || j % x == 0 || j % i == 0)
                    c += 1;
            }
            if (c==0)
                System.out.println("(" + i + ", " + j + ")");
        }
    }
}
