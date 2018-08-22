package de.no3x.tdd.money;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyExampleTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
