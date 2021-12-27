package com.company.main;

import java.util.Arrays;

public class Bohan2021 {
    public static void main(String[] args) {
//        Niven();
//        System.out.println(Most("bbracadabra"));

        int arr1[] = {5,-3,0,6,-9,6,4,0,8,6};
        int arr2[] = {7,8,0,3,3,4,4};
        int arr3[] = either(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static void Niven() {
        for (int i = 100; i < 999; i++) {
            int hundreds = i / 100;
            int tens = (i % 100) / 10;
            int units = (i % 100) % 10;
            if (tens != 0 && units != 0) {
                if ((i % hundreds == 0) && (i % tens == 0) && (i % units == 0)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static char Most(String s) {
        char c = s.charAt(0);
        int max = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    counter++;
            }
            if (counter > max) {
                max = counter;
                c = s.charAt(i);
            }
            max = 0;
            counter = 0;
        }
        return c;
    }

    public static int larger_than_ave(int a[]) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        average = sum / a.length;

        int counter = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > average) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] either(int[] arr1, int[] arr2) {
        int max_length = Math.max(arr1.length, arr2.length);
        int[] arr3 = new int[max_length];
        boolean exist = false;
        int j;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            j = i;
            while (j < arr2.length) {
                if (arr1[i] == arr2[j]) {
                    exist = true;
                }
                j++;
            }
            if (!exist) {
                arr3[index] = arr1[i];
                index++;
            }
        }

        return arr3;
    }
}
