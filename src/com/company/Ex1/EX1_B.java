package com.company.Ex1;

import com.company.main.MyConsole;

public class EX1_B {
    // Driver Program - Create main in class
    public static void main(String[] args) {
        boolean isGoAgain = true;
        while (isGoAgain) {
            int num = MyConsole.readInt("enter a number: 0) exit, 1) aX^2+bX+c=0 ");
            switch (num) {
                // User want to exit
                case 0 -> {
                    System.out.println("done!");
                    isGoAgain = false;
                }
                // User want to keep use the program
                case 1 -> {
                    double a = MyConsole.readDouble("Enter a: ");
                    double b = MyConsole.readDouble("Enter b: ");
                    double c = MyConsole.readDouble("Enter c: ");
                    double square_root = b * b - 4.0 * a * c;
                    // if on the axis X -> x takes all values
                    if (a == 0 && b == 0 && c == 0) {
                        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
                        System.out.println("X takes all values");
                        break;
                    }
                    // if a=0 and b=0 -> no solution
                    if ((a == 0 && b == 0 && c != 0) || (square_root < 0)) {
                        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
                        System.out.println("No solution");
                        break;
                    }
                    // if a==0 and b!=0
                    if (a == 0 && b != 0) {
                        // 0=bx+c -> x=(-c)/b
                        double result = -c / b;
                        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
                        System.out.println("x1 = x2 = " + result);
                        break;
                    }
                    // if a!=0 and b==0
                    else if (square_root > 0.0) {
                        double result1 = (-b + Math.pow(square_root, 0.5)) / (2.0 * a);
                        double result2 = (-b - Math.pow(square_root, 0.5)) / (2.0 * a);
                        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
                        System.out.println("x1 = " + result1 + " , x2 = " + result2);
                    } else if (square_root == 0) {
                        double result = -b / 2 * a;
                        System.out.println(a + "X^2 + " + b + "X + " + c + " = 0");
                        System.out.println("x1 = x2 = " + result);
                    }
                }
            }
        }
    }
}
