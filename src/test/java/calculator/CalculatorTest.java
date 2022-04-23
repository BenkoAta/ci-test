package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(11, new Calculator().add(5, 6));
    }

    @Test
    void testMultiply() {
        assertEquals(30, new Calculator().multiply(5, 6));
    }
}