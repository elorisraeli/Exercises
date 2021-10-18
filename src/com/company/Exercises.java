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

    // get the max and min of: int, short, long, double, float
    public static void exercise12() {
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

    // boolean if number is prime number
    public static boolean is_prime_number(long num) {
        long counter = num - 1;
        boolean is_prime_number = num > 1;
        while ((counter > 1) && (is_prime_number)) {
            if (num % counter == 0) {
                return false;
            }
            counter -= 1;
        }
        return true;
    }

    // check if there are more fermat numbers whom correct
    public static void fermat_numbers() {
        for (double i = 1.0; i <= Long.MAX_VALUE; i ++) {
            long fermat = (long) Math.pow(2.0, Math.pow(2.0, i)) + 1;
            if ((fermat < Long.MAX_VALUE)&&(fermat > 0)) {
                System.out.println("In range, calculating: ");
                if (is_prime_number(fermat)) {
                    System.out.println(i + " - A prime number, the number is: " + fermat);
                } else {
                    System.out.println(i + " - Not a prime number");
                }
            }
        }
    }

    public static void month_generator(){
        int month = MyConsole.readInt("Enter number of month: ");
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("No valid month");
        }
    }

    //solve the function: a*x=b
    public static void Exercise2_1(){
        double a = MyConsole.readDouble("Enter a number to divide (b): ");
        double b = MyConsole.readDouble("Enter a divider (a): ");
        if ((b==0) && (a==0)){
            System.out.println("Infinity solutions");
        }else if (b == 0){
            System.out.println("No solutions");
        }else {
            double sum = a / b;
            System.out.println("The result of a*x=b is: " + sum);
        }

    }

    // count the numbers until the number and sum them
    public static void Exercise2_2(){
        int num = MyConsole.readInt("Enter a number bigger then zero: ");
        int counter = 0;
        int sum = 0;
        while (counter<=num){
            sum += counter;
            counter += 1;
        }
        System.out.println("The sum of S (1+2+3+....+your number) is: " + sum);
    }

    // count the number of digits
    public static void Exercise2_3(){
        int num = MyConsole.readInt("Enter a number: ");
        int counter = 1;
        while (true){
            boolean is_bigger_then_zero = (num / 10)>0;
            num = num/10;
            if (!is_bigger_then_zero){
                break;
            }
            counter += 1;
        }
        System.out.println("The number have " + counter + " digits");
    }

    // count the zero digits of the number
    public static void Exercise2_4(){
        int num = MyConsole.readInt("Enter a number: ");
        int zeros = 0;
        while (true){
            boolean is_bigger_then_zero = (num / 10)>0;
            if (num%10 == 0){
                zeros += 1;
            }
            num = num/10;
            if (!is_bigger_then_zero){
                break;
            }
        }
        System.out.println("The number have " + zeros + " zeros");

    }

    // Assembly of number
    public static void Exercise2_5(){
        int assembly = MyConsole.readInt("Enter a number to assembly: ");
        int counter = 1;
        int sum = 1;
        while (counter<=assembly){
            sum *= counter;
            counter += 1;
        }
        System.out.println("The assembly of: " + assembly + " is: " + sum);
    }

    // Pow of numbers
    public static void Exercise2_6(){
        int m = MyConsole.readInt("Enter a number to pow : ");
        int n = MyConsole.readInt("Enter the pow number: ");
        int sum = m;
        while (n>=2){
            sum *= m;
            n -= 1;
        }
        System.out.println("The pow of: " + m + "^" + n + " is: " + sum);
    }

    // Find the lower same divider of 2 numbers
    public static void Exercise2_7(){
        int num1 = MyConsole.readInt("Enter a number: ");
        int num2 = MyConsole.readInt("Enter another number: ");

    }


}
