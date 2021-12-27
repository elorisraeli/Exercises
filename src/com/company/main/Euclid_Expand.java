package com.company.main;

public class Euclid_Expand {
    public static void main(String[] args) {
        int a = MyConsole.readInt("Enter a:");
        int b = MyConsole.readInt("Enter b:");
        solve(a, b);
    }
    /** Function to solve **/
    public static void solve(long a, long b)
    {
        long x = 0, y = 1, lastx = 1, lasty = 0, temp;
        while (b != 0)
        {
            long q = a / b;
            long r = a % b;

            a = b;
            b = r;

            temp = x;
            x = lastx - q * x;
            lastx = temp;

            temp = y;
            y = lasty - q * y;
            lasty = temp;
        }
        System.out.println("Roots  x : "+ lastx +", y : "+ lasty);
    }
}
