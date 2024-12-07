package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void testDiv() {
        int result = calculator.div(6, 3);
        assertThat(result).isEqualTo(2);

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.div(6, 0));
        assertThat(exception.getMessage()).isEqualTo("Cannot divide by zero");
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertThat(result).isEqualTo(6);

        result = calculator.multiply(-2, 3);
        assertThat(result).isEqualTo(-6);

        result = calculator.multiply(0, 5);
        assertThat(result).isEqualTo(0);
    }
}
