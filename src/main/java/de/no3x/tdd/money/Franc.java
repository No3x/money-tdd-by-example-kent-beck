package de.no3x.tdd.money;

class Franc extends Money {

    Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}