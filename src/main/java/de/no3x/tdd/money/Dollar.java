package de.no3x.tdd.money;

class Dollar extends Money {

    Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
