package com.company;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    public static final int SAVING=1;
    public static final int CHECKING=2;
    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public boolean isChecking(){
        return accountType==CHECKING;
    }
    public boolean isSaving(){
        return accountType==SAVING;
    }

    public double withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        return balance;
    }
    public double deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        return balance;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
