package com.calculator.calculator;

import com.calculator.Exceptions.DivisionByZeroException;
import com.calculator.calculator.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import java.security.DigestException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void sumPositive() {
        assertEquals(10,calculatorService.add(3,7));
    }

    @Test
    void sumNegative() {

        assertEquals(-10, calculatorService.add(-3, -7));
    }

    @Test
    void sumSymmetry() {
        assertEquals(calculatorService.add(3,4),calculatorService.add(4,3));
    }
    @Test
    void minusPositive() {
        assertEquals(-4,calculatorService.minus(3,7));
    }

    @Test
    void minusNegative() {
        assertEquals(4, calculatorService.minus(-3, -7));
    }
    @Test
    void minusNotSymmetry() {
        assertNotEquals(calculatorService.minus(3,4),calculatorService.minus(4,3));
    }
    @Test
    void multiplyPositive() {
        assertEquals(12,calculatorService.multiply(3,4));
    }

    @Test
    void multiplyNegative() {
        assertEquals(-12, calculatorService.multiply(3, -4));
    }

    @Test
    void multiplySymmetry() {
        assertEquals(calculatorService.multiply(3,4),calculatorService.multiply(4,3));
    }
    @Test
    void dividePositive() {
        assertEquals(0,calculatorService.divide(3,4));
    }

    @Test
    void divideNegative() {
        assertEquals(-5, calculatorService.divide(20, -4));
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> {
            calculatorService.divide(5, 0);
        });
    }
}
