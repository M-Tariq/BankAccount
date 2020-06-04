package com.company;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount bankAccount;
    @org.junit.Before
    public void setup(){
        System.out.println("Before each test");
        bankAccount=new BankAccount("Muhammad", "Tariq", 2300, BankAccount.SAVING);
    }

    @org.junit.Test
    public void isChecking() {
        assertTrue(bankAccount.isSaving(), "Account is not checking");
    }

    @org.junit.Test
   public void isSaving() {
        assertTrue(bankAccount.isSaving());
    }

    @org.junit.Test
    public void withdraw() {
        fail("test case fail");
    }

    @org.junit.Test
    public void deposit() {
        assertEquals(3000, bankAccount.deposit(700));
    }
    @org.junit.After
    public void after(){
        System.out.println("after");
    }
}