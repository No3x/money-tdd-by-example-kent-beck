package de.no3x.tdd.money;

class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount = amount * multiplier;
    }

}
