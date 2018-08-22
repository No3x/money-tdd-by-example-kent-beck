package de.no3x.tdd.money;

class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        amount *= multiplier;
        return null;
    }

}
