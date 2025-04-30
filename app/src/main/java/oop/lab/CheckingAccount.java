package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    public CheckingAccount(String accNumber, String ownerName, double balance) {
        super(accNumber, ownerName, balance);
    }

    @Override
    public void transfer(String accDestination, double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer to: " + accDestination + " = " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Failed. Not enough balance");
        }
    }

    @Override
    public void calculateInterest(){

    }

    public void payBills(double amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(ownerName + "(" + accNumber + ") paid amount: " + amount);
        } else {
            throw new IllegalArgumentException("Not enough balance");
        }
    }

}
