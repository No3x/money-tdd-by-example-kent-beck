package de.no3x.tdd.money;

class Dollar extends Money {

    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }
}
