package oop.lab;

public class PlatinumCard extends Card{
    public PlatinumCard(String cardNumber, String cardOwner){
        super(cardNumber, cardOwner);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
