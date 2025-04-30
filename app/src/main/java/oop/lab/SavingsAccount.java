package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    public SavingsAccount(String accNumber, String ownerName, double balance) {
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
    public void calculateInterest() {
        double interest = balance*0.03;
        balance += interest;
    }

    
}
