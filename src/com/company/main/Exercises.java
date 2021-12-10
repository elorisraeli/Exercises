package com.company.main;

import java.util.Arrays;
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
        for (double i = 1.0; i <= Long.MAX_VALUE; i++) {
            long fermat = (long) Math.pow(2.0, Math.pow(2.0, i)) + 1;
            if ((fermat < Long.MAX_VALUE) && (fermat > 0)) {
                System.out.println("In range, calculating: ");
                if (is_prime_number(fermat)) {
                    System.out.println(i + " - A prime number, the number is: " + fermat);
                } else {
                    System.out.println(i + " - Not a prime number");
                }
            }
        }
    }

    public static void month_generator() {
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
    public static void Exercise2_1() {
        double a = MyConsole.readDouble("Enter a number to divide (b): ");
        double b = MyConsole.readDouble("Enter a divider (a): ");
        if ((b == 0) && (a == 0)) {
            System.out.println("Infinity solutions");
        } else if (b == 0) {
            System.out.println("No solutions");
        } else {
            double sum = a / b;
            System.out.println("The result of a*x=b is: " + sum);
        }

    }

    // count the numbers until the number and sum them
    public static void Exercise2_2() {
        int num = MyConsole.readInt("Enter a number bigger then zero: ");
        int counter = 0;
        int sum = 0;
        while (counter <= num) {
            sum += counter;
            counter += 1;
        }
        System.out.println("The sum of S (1+2+3+....+your number) is: " + sum);
    }

    // count the number of digits
    public static void Exercise2_3() {
        int num = MyConsole.readInt("Enter a number: ");
        int counter = 1;
        while (true) {
            boolean is_bigger_then_zero = (num / 10) > 0;
            num = num / 10;
            if (!is_bigger_then_zero) {
                break;
            }
            counter += 1;
        }
        System.out.println("The number have " + counter + " digits");
    }

    // count the zero digits of the number
    public static void Exercise2_4() {
        int num = MyConsole.readInt("Enter a number: ");
        int zeros = 0;
        while (true) {
            boolean is_bigger_then_zero = (num / 10) > 0;
            if (num % 10 == 0) {
                zeros += 1;
            }
            num = num / 10;
            if (!is_bigger_then_zero) {
                break;
            }
        }
        System.out.println("The number have " + zeros + " zeros");

    }

    // Assembly of number
    public static void Exercise2_5() {
        int assembly = MyConsole.readInt("Enter a number to assembly: ");
        int counter = 1;
        int sum = 1;
        while (counter <= assembly) {
            sum *= counter;
            counter += 1;
        }
        System.out.println("The assembly of: " + assembly + " is: " + sum);
    }

    // Pow of numbers
    public static void Exercise2_6() {
        int m = MyConsole.readInt("Enter a number to pow : ");
        int n = MyConsole.readInt("Enter the pow number: ");
        int sum = m;
        while (n >= 2) {
            sum *= m;
            n -= 1;
        }
        System.out.println("The pow of: " + m + "^" + n + " is: " + sum);
    }

    // Find the lower same divider of 2 numbers
    public static void Exercise2_7() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();

        int biggest_divider = 0;
        int counter = 0;
        while (counter <= (num1 / 2) && counter <= (num2 / 2)) {
            counter += 1;
            if ((num1 % counter == 0) && (num2 % counter == 0) && (counter > biggest_divider)) {
                biggest_divider = counter;
            }
        }
        System.out.println("The biggest divisor of the 2 numbers is: " + biggest_divider);
    }

    // smallest number between 3 numbers
    public static void Exercise2_8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        int biggest;
        if (num1 < num2) {
            if (num1 < num3) {
                biggest = num1;
            } else {
                biggest = num3;
            }
        } else if (num2 < num3) {
            biggest = num2;
        } else {
            biggest = num3;
        }

//        // another option
//        biggest = Math.min(num1, Math.min(num2,num3));
        System.out.println("The biggest number is: " + biggest);
    }


    // biggest number between 3 numbers
    public static void Exercise2_9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        int biggest;
        if (num1 > num2) {
            if (num1 > num3) {
                biggest = num1;
            } else {
                biggest = num3;
            }
        } else if (num2 > num3) {
            biggest = num2;
        } else {
            biggest = num3;
        }

//        // another option
//        biggest = Math.max(num1, Math.max(num2,num3));
        System.out.println("The biggest number is: " + biggest);
    }

    // find armstrong numbers between 100-999
    public static boolean Is_Armstrong_Number(int num) {
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;
        if ((hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones) == num) {
            return true;
        } else
            return false;
    }

    public static void Armstrongs() {
        for (int i = 100; i <= 999; i++) {
            if (Is_Armstrong_Number(i)) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }

    // Assembly of number with for loop
    public static void Exercise3_1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int assembly = input.nextInt();
        int counter = 1;
        int sum = 1;
        for (int i = 1; i <= assembly; i++) {
            sum *= counter;
            counter += 1;
        }
        System.out.println("The assembly of: " + assembly + " is: " + sum);
    }

    // print triangle with a size of a number
    public static void Exercise3_2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // pow of 2 numbers with for loop
    public static void Exercise3_3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the pow: ");
        int num2 = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= num2; i++) {
            sum *= num1;
        }
        System.out.println(sum);
    }

    // fibonacci number
    public static void Exercise3_4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("A reminder, max value of Integer is: " + Integer.MAX_VALUE);
        for (int i = 1; i < n; ++i) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("Fibonacci number in place " + n + " is: " + firstTerm);
    }

    // find the biggest number
    public static void Exercise3_5() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int max = n;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            int m = input.nextInt();
            if (m > n) {
                max = m;
            }
        }
        System.out.println("The biggest number is: " + max);
    }

    // find perfect number
    public static void Exercise3_6() {
        int i, Number, Sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Number = input.nextInt();

        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d is a Perfect Number", Number);
        } else {
            System.out.format("\n% d is NOT a Perfect Number", Number);
        }
    }

    // print a triangle by number of rows
    public static void Exercise3_7() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int y = 0; y <= rows; y++) {
            for (int spaces = 0; spaces <= y - 1; spaces++) {
                System.out.print(" ");
            }
            for (int x = rows - y; x >= 1; x--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // using switch case - even or not
    public static void Exercise3_8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        switch (num) {
            case 0, 2, 4, 6, 8, 10 -> System.out.println("The number is even");
            case 1, 3, 5, 7, 9 -> System.out.println("The number is odd");
            default -> System.out.println("Number is not in range");
        }
    }

    // find if array is a symmetrical array
    public static void Exercise4_1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int N = input.nextInt();
        int i;
        int[] numbers = new int[N];
        for (i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        i = 0;
        while ((i < N/2) && (numbers[i] == numbers[N - 1 - i])) {
            i++;
        }
        if (i == N/2) {
            System.out.println("The array is a symmetrical array");
        } else {
            System.out.println("The array is NOT a symmetrical array");
        }
    }

    // reverse the array
    public static void Exercise4_2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int N = input.nextInt();
        int[] numbers = new int[N];
        int[] helper = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 1; i <= N; i++) {
            helper[N-i] = numbers[i-1];
        }
        System.out.println(Arrays.toString(helper));
    }

    // median
    public static void Exercise4_3() {

    }

    // (x^3-2)/(x+2) ∈ Z
    // (Numerator = מונה, denominator = מכנה)
    public static void Torata_Exercise4(){
        for (int i=-1000; i<1000; i++){
            double numerator = Math.pow(i, 3) - 2;
            double denominator = i + 2;
            double result_double = (numerator/denominator);
            int result_int = (int) (numerator/denominator);
            if (result_double == result_int){
                System.out.println("The number: " + i + " -> (x^3-2)/(x+2) ∈ Z " + "result=" + result_double);
            }
        }
    }
}

