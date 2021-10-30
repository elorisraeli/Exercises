package com.company;

import java.util.ArrayList;
import java.util.List;

public class EX1_A {

    // check if number is prime
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

    // print all the prime numbers until num and with the space of space
    public static void prime_gap(int num, int space){
        List<Integer> primes = new ArrayList<>();
        for (int x = 2; x <= num; x++){
            if (is_prime_number(x)){
                primes.add(x);
            }
        }
        for (int i=2; i <=primes.size(); i++) {
            int num3 = primes.get(i-1);
            for(int prime : primes){
                if ((num3 - prime) == space){
                    System.out.println("(" + prime + ", " + num3 + ")");
                    break;
                }
            }
        }
    }

    // the function you will use in main to ask the numbers from user:
    public static void EX1_A(){
        System.out.println("The program will check the spaces (m) between prime numbers until a number (n)");
        int n = MyConsole.readInt("Enter a number to see all prime numbers below him (n): ");
        int m = MyConsole.readInt("Enter a number space between prime numbers (m): ");
        prime_gap(n, m);
    }


}
