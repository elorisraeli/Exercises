package com.company.Liad_practice;

public class Account {

   private double balance;
   private String Owner;
   private String ID;
   private int credit;


   public Account(double bal, String owner, String id){

       balance = bal;
       Owner = owner;
       ID = id;
       credit = 1000;
   }

   //methods

    public double remainingBalance(){return balance;}
    public void deposit(double money){
       if( money < 0)
           return;
       balance += money;
    }
    public double withdrawal(double sum){

        if( sum > balance + credit){
            System.out.println("insufficient funds");
            return 0;
        }

        balance -= sum;
        return sum;

    }






}
