package oop.lab;

public class DebitCard extends Card{
    public DebitCard(String cardNumber, String cardOwner){
        super(cardNumber, cardOwner);
    }

    @Override
    public double getInterestRate() {
        return 0.0;
    }
    
}
