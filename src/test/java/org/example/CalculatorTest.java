package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void testSum() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.sum(2, 2));
    }
}
