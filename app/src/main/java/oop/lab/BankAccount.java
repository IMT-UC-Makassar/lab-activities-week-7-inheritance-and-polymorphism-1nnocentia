package oop.lab;

public abstract class BankAccount {
    protected String accNumber;
    protected String ownerName;
    protected double balance;

    //constructor
    public BankAccount(String accNumber, String ownerName, double balance) {
        this.accNumber = accNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //function that other class need too
    public void deposit(double amount) {
        balance += amount;
        System.out.println(ownerName + "(" + accNumber + ") deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(ownerName + "(" + accNumber + ") withdraw: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    //getter
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return ownerName;
    }

    //abstract method
    public abstract void calculateInterest();

    public void transferFunds(double amount, String accDestination) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer to: " + accDestination + " = " + amount);
            System.out.println("Balance: " + balance);
        } else {
            throw new IllegalArgumentException("Not enough balance");
        }
    }

}
