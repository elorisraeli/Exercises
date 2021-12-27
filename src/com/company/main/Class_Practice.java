package com.company.main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Class_Practice {
    public static void main(String[] args) {
//        // wonderful option to check how much time an operation took.
//        long startTime = System.currentTimeMillis();
//        System.out.println("Operation took " + (System.currentTimeMillis() - startTime) + " milliseconds");
//        //

//        int[][] f = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] t = {{1,0,0},{0,1,0},{0,0,1}};
//        // 1 0 0
//        // 0 1 0
//        // 0 0 1
//
//        boolean identity = true;
//        for(int i=0; i<t.length; i++)
//            for(int j=0; j<t[i].length; j++) {
//                if(i==j && t[i][j] !=1) identity = false;
//                if(i!=j && t[i][j] !=0) identity = false;
//            }
//        if (identity){
//            System.out.println("Identity");
//        }else
//            System.out.println("NOT Identity");
        int[][] f = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 1 2 3
        // 4 5 6
        // 7 8 9
        for (int i = 0; i < f.length; i++)
            System.out.println(Arrays.toString(f[i]));

        for (int i = 0; i < f.length; i++)
//            for (int j=0;j<f[i].length;j++){
            for (int j = 0; j < i; j++) {
                // The prints to understand well the switches
                System.out.println();
                for (int x = 0; x < f.length; x++)
                    System.out.println(Arrays.toString(f[x]));
                System.out.println("j="+j+", i="+i+", f[i][j]="+f[i][j]+",f[j][i]="+f[j][i]);
                // The switch
                int temp = f[i][j];
                f[i][j] = f[j][i];
                f[j][i] = temp;
            }
        // The array 2d is
        System.out.println();
        for (int i = 0; i < f.length; i++)
            System.out.println(Arrays.toString(f[i]));

//        // Same
//        System.out.println(Arrays.deepToString(f));
    }

    public static void arrays() {
        int a = MyConsole.readInt("Enter number: ");
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++)
            b[i] = (int) (20 * Math.random()) - 10;
        System.out.println(Arrays.toString(b));
//        System.out.println("The max: " + Arrays.stream(b).max().getAsInt());
//        System.out.println("The sum: " + Arrays.stream(b).sum());

        boolean isPalindrom = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != b[b.length - 1 - i])
                isPalindrom = false;
        }
        if (isPalindrom)
            System.out.println("The array is Palindrome");

        int c[] = IntStream.rangeClosed(1, b.length).map(i -> b[b.length - i]).toArray();
        System.out.println(Arrays.toString(c));

    }
}

// Ex2 extras:
//        int[][] R2 = new int[R.length][R[0].length];
//        int[][] G2 = new int[G.length][G[0].length];
//        int[][] B2 = new int[B.length][B[0].length];
//        img[0] = R2;
//        img[1] = G2;
//        img[2] = B2;

