package com.company.main;

public class Logic_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double two = Math.pow(2, i);
            if (two % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
