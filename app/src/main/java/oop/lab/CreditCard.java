package oop.lab;

public class CreditCard extends Card{
    public CreditCard(String cardNumber, String cardOwner){
        super(cardNumber, cardOwner);
    }

    @Override
    public double getInterestRate() {
        return 15.0;
    }
    
}
