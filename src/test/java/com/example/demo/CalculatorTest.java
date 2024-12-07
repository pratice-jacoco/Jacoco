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
        // 정상적인 나누기 테스트
        int result = calculator.div(6, 3);
        assertThat(result).isEqualTo(2);

        // 0으로 나누는 경우 예외 처리 테스트
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.div(6, 0));
        assertThat(exception.getMessage()).isEqualTo("Cannot divide by zero");
    }
}
