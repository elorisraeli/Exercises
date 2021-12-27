package com.company.Liad_practice;

public class Student {

    private String name;
    private double age;
    private String ID;
    private double[] grades;
    private static int schoolID;
    private Account bankAcc;



    public Student(String name, String ID, double age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public Student(){}


    //getters
    public String getName(){return name;}
    public double getAge(){return  age;}
    public String getID(){return ID;}
    public Account getBankAcc(){return bankAcc;}

    //setter
    public void setName(String name){this.name = name;}
    public void setBankAcc(Account a){


        bankAcc = a;
    }



    public static void main(String[] args) {







    }

}
