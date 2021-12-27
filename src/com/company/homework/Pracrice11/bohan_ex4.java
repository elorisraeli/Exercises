package com.company.homework.Pracrice11;

import java.util.ArrayList;
import java.util.Arrays;

public class bohan_ex4 {
    public static void main(String[] args) {


        ArrayList<String> a = new ArrayList<>();

        a.add("Hello");
        a.add("hi");
        a.add("rain");

        a.remove(1);
        a.set(1,"Thunder");


        if(a.isEmpty())
            System.out.println("The arrayList is empty!");
        else
            System.out.println("There are some elements inside");

        System.out.println(a.get(0));
        System.out.println(a.toString());

        int arr[] = {1,5,6,99,24};
        int arr2[] = {1,4,4,6,102};

        System.out.println(Arrays.toString(either(arr,arr2)));



    }

    public static int[] either(int[] a, int[] b){

        //Transform to arrayLists
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int i: a){al1.add(i);}
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i: b){al2.add(i);};


        ArrayList<Integer> c = new ArrayList<>(al1);

        al1.removeAll(al2);
        al2.removeAll(c);
        al1.addAll(al2);

        //remove duplicates
        ArrayList<Integer> ans = new ArrayList<>();

        for(Integer i: al1){
            if(!ans.contains(i))
                ans.add(i);
        }

        //transform to regular array
        int[] arr = new int[ans.size()];
        for(int i = 0 ; i <arr.length; i++){
            arr[i] = ans.get(i);
        }


        return arr;
    }


}
