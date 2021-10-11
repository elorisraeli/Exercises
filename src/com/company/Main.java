package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean is_prime_number(int num){
        int counter = num - 1;
        boolean is_prime_number = num > 1;
        while ((counter>1) && (is_prime_number)){
            if (num%counter==0){
                return false;
            }
            counter -= 1;
        }
        return true;
    }

    // Exercise 3:
    // print all the prime numbers from input number with difference of input space
    // example: input number = 20, input space = 4, will print 3,7 | 7,11 | 13,17
    public static void prime_spaces(int num, int space){
        List<Integer>primes = new ArrayList<>();
        for (int x = 2; x <= num; x++){
            if (is_prime_number(x)){
                primes.add(x);
            }
        }
        System.out.println(primes);
        for (int i=primes.size(); i >= 2; i--) {
            int num3 = primes.get(i-1);
            for(int prime : primes){
                if ((num3 - prime) == space){
                    System.out.println(num3 + ", " + prime);
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
	// write your code here
        // Exercise 1:
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//        int counter = number - 1;
//        boolean is_prime_number = number > 1;
//        while ((counter>1) && (is_prime_number)){
//            if (number%counter==0){
//                is_prime_number = false;
//                break;
//            }
//            counter -= 1;
//        }
//        System.out.println("The number: " + number + " is prime? " + is_prime_number);

//        // Exercise 2:
//        // print if 2 prime number are difference of 2, example: 5,3 -> 5-3=2
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//        List<Integer>primes = new ArrayList<>();
//        for (int x = 0; x <= number; x++){
//            if (is_prime_number(x)){
//                primes.add(x);
//            }
//        }
//        for (int i=primes.size(); i > 2; i--) {
//            int num3 = primes.get(i-1);
//            int num4 = primes.get(i-2);
//            if ((num3 - num4) == 2){
//                System.out.println(num3 + ", " + num4);
//            }
//        }

        prime_spaces(20, 4);
    }


}
