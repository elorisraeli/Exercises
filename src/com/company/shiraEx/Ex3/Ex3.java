package com.company.shiraEx.Ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int a= 15; int b=3;
        System.out.println(divide(a,b));
    }
    public static boolean validPassword(String s)
    {
        if(s.length()<6) return false;
        String numbers= "0123456789";
        String tav= "%$#@!";
        int degel1=0 ;
        int degel2=0;
        for(int i=0; i<s.length(); i++)
        {
            for(int i1=0; i1<tav.length(); i1++)
            {
                if(s.charAt(i)==tav.charAt(i1))
                    degel1= 1;
            }
            for(int i2=0; i2<numbers.length(); i2++)
            {
                if(s.charAt(i)==numbers.charAt(i2))
                    degel2=1;
            }
        }
        if(degel1==0) return false;
        if(degel2==0) return false;
        if(s.contains(" ")) return false;
        return true;
    }
    public static int divide(int a, int b)
    {
        if(b==0) return Integer.MIN_VALUE;
        if(a==0) return 0;
        if(a-b==0) return 1;
        if(a<b) return 0;
        else return 1 + divide(a-b, b);
    }
}
