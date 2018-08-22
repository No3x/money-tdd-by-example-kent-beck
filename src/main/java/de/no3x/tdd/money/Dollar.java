package de.no3x.tdd.money;

class Dollar extends Money {

    private String currency;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        currency = "USD";
        return currency;
    }
}
