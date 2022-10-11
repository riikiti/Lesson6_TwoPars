package com.example.lesson6_twopars;

public class Couples {
    private int firstCard; // id picture (getdraweble)
    private int secondCard; // id picture
    private boolean equal;

    public Couples() {

    }

    public int getFirstCard() {
        return firstCard;
    }

    public void setFirstCard(int firstCard) {
        this.firstCard = firstCard;
    }

    public int getSecondCard() {
        return secondCard;
    }

    public void setSecondCard(int secondCard) {
        this.secondCard = secondCard;
    }

    public boolean isEqual() {
        return firstCard == secondCard? true : false;
    }
}
