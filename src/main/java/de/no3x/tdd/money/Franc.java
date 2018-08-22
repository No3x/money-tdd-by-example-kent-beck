package de.no3x.tdd.money;

class Franc extends Money {

    private String currency;

    Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currency() {
        currency = "CHF";
        return currency;
    }
}