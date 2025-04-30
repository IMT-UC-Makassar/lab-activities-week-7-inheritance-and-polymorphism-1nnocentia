package oop.lab;

public abstract class Card {
    protected String cardNumber;
    protected String cardOwner;

    public Card(String cardNumber, String cardOwner){
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
    }

    public abstract double getInterestRate();

    public String getCardOwner(){
        return cardOwner;
    }
}
