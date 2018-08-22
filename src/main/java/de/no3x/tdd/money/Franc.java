package de.no3x.tdd.money;

class Franc extends Money {

    Franc(int amount, String currency) {
        this.amount = amount;
        currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

}