package com.company;

public class EX1_B {

    // the function you will use in main to ask the numbers from user:
    // help: go to "Main.java" -> between main {....} enter the line:  EX1_B.EX1_B();
    public static void EX1_B() {
        boolean isGoAgain = true;
        while (isGoAgain) {
            int num = MyConsole.readInt("enter a number: 0) exit, 1) aX^2+bX+c=0 ");
            switch (num) {
                case 0:
                    System.out.println("done!");
                    isGoAgain = false;
                case 1:
                    double a = MyConsole.readDouble("Enter a: ");
                    double b = MyConsole.readDouble("Enter b: ");
                    double c = MyConsole.readDouble("Enter c: ");
                    double square_root = b * b - 4.0 * a * c;
                    if (a==0 && b==0 && c==0){
                        System.out.println("X takes all values");
                    }else {
                        if (square_root > 0.0) {
                            double result1 = (-b + Math.pow(square_root, 0.5)) / (2.0 * a);
                            double result2 = (-b - Math.pow(square_root, 0.5)) / (2.0 * a);
                            System.out.println(a + "X^2+" + b + "X+" + c + "=0");
                            System.out.println("x1=" + result1 + " x2=" + result2);
                        } else if (square_root == 0.0) {
                            double result1 = -b / (2.0 * a);
                            System.out.println("The result is X=" + result1);
                        } else {
                            System.out.println("No solution");
                        }
                    }
            }
        }
    }
}
