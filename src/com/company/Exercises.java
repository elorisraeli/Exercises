package com.company;

import java.util.Scanner;

public class Exercises {

    // switch arguments position
    public static void exercise1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter another number: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a + ", " + b);
    }

    // switch arguments position
    public static void exercise2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        System.out.print("Enter a number: ");
        int y = input.nextInt();
        System.out.print("Enter a number: ");
        int z = input.nextInt();
        System.out.print("Enter a number: ");
        int u = input.nextInt();
        int saver = x;
        x = y;
        y = z;
        z = u;
        u = saver;
        System.out.println(x + ", " + y + ", " + z + ", " + u);
    }

    // average of 2 numbers
    public static void exercise3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        double average = (num1 + num2) / 2.0;
        System.out.println(average);
    }

    // integer average of 2 numbers
    public static void exercise4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        int average = (num1 + num2) / 2;
        System.out.println(average);
    }

    // get the units number of triple digits number
    public static void exercise5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a triple digits number: ");
        int triple_digits = input.nextInt();
        int unit_num = triple_digits % 10;
        System.out.println(unit_num);
    }

    // get the tens digit of triple digits number
    public static void exercise6() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a triple digits number: ");
        int triple_digits = input.nextInt();
        int tens_num = triple_digits % 100 / 10;
        System.out.println(tens_num);
    }

    // print all digits of triple digits number
    public static void exercise7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a triple digits number: ");
        int triple_digits = input.nextInt();
        int unit_num = triple_digits % 10;
        int tens_num = triple_digits % 100 / 10;
        int hundred_num = triple_digits / 100;
        System.out.println(hundred_num + ", " + tens_num + ", " + unit_num);
    }

    // print the rest of number to another number
    public static void exercise8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        int rest = num1 % num2;
        System.out.println(rest);
    }

    // sun all digits of triple digits number
    public static void exercise9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a triple digits number: ");
        int triple_digits = input.nextInt();
        int unit_num = triple_digits % 10;
        int tens_num = triple_digits % 100 / 10;
        int hundred_num = triple_digits / 100;
        double sum = (hundred_num + tens_num + unit_num) / 3.0;
        System.out.println(sum);
    }

    // convert seconds to hours and minutes
    public static void exercise10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of seconds: ");
        int seconds = input.nextInt();
        int rest_seconds = seconds % 60;
        int minutes = (seconds / 60) % 60;
        int hours = (seconds / 3600) % 3600;
        System.out.println("Hours: " + hours + ", minutes: " + minutes + ", seconds: " + rest_seconds);
    }

    // get radius of circle, print circumference and area
    public static void exercise11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int radius = input.nextInt();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area + ", circumference: " + circumference);
    }

    public static void exercise12() {
        // get the max and min of: int, short, long, double, float
        int max_int = Integer.MAX_VALUE;
        int min_int = Integer.MIN_VALUE;
        short max_short = Short.MAX_VALUE;
        short min_short = Short.MIN_VALUE;
        long max_long = Long.MAX_VALUE;
        long min_long = Long.MIN_VALUE;
        double max_double = Double.MAX_VALUE;
        double min_double = Double.MIN_VALUE;
        float max_float = Float.MAX_VALUE;
        float min_float = Float.MIN_VALUE;
        System.out.println("Integer: [" + min_int + ", " + max_int + "]");
        System.out.println("Short: [" + min_short + ", " + max_short + "]");
        System.out.println("Long: [" + min_long + ", " + max_long + "]");
        System.out.println("Double: [" + min_double + ", " + max_double + "]");
        System.out.println("Float: [" + min_float + ", " + max_float + "]");
    }
}
