package com.company.Liad_practice;

public class Main {


    public static void main(String[] args) {


        Student s = new Student("Dani","1004",24);
        s.setBankAcc(new Account(1500,s.getName(), s.getID()));

        s.getBankAcc().deposit(900);

        System.out.println();

    }

}
