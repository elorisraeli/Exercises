package com.company.Liad_practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {
    Account acc;

    @BeforeEach
    public void init(){

        acc = new Account(2500," Dani", "1050");
    }

    @Test
    void testRemainingBal(){

        assertEquals(2500, acc.remainingBalance());
    }

    @Test
    void testDeposit(){

        acc.deposit(1500);
        assertEquals(4000,acc.remainingBalance());

        acc.deposit(-500);
        assertEquals(4000,acc.remainingBalance());
    }

    @Test
    void testWith(){

        acc.withdrawal(100);
        assertEquals(2400, acc.remainingBalance());
        acc.withdrawal(2600);

        assertEquals(-200, acc.remainingBalance());

        acc.withdrawal(1000);

        assertEquals(-200, acc.remainingBalance());



    }



}