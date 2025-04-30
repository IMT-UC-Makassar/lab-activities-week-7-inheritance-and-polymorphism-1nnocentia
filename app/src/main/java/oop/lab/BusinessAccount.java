package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService{
    private boolean loanRequest = false;

    public BusinessAccount(String accNumber, String ownerName, double balance) {
        super(accNumber, ownerName, balance);
    }

    @Override
    public void applyForLoan(double amount) {
        loanRequest = true;
        System.out.println(ownerName + "(" + accNumber + ") apply for loan of" + amount );
    }

    @Override
    public String checkLoanStatus() {
        return loanRequest ? "Pending" : "No Loan Requested";
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
        double interest = balance*0.05;
        balance += interest;
    }
    
}
