package de.no3x.tdd.money;

class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
