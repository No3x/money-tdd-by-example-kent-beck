package de.no3x.tdd.money;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
