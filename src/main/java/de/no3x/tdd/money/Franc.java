package de.no3x.tdd.money;

class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Money Franc = (Franc) obj;
        return amount == Franc.amount;
    }
}