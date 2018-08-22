package de.no3x.tdd.money;

class Franc {

    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc Franc = (Franc) obj;
        return amount == Franc.amount;
    }
}