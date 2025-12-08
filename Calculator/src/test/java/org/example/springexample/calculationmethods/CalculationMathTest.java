package org.example.springexample.calculationmethods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationMathTest {

    private final CalculationMath calculationMethods = new CalculationMath();
    private final long firstNumber = 5;
    private final long secondNumber = 2;

    @Test
    @DisplayName("Test summation for numbers")
    public void testSummation() {
        long result = firstNumber + secondNumber;
        assertEquals(result, calculationMethods.summation(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test subtraction for numbers")
    public void testSubtraction() {
        long result = firstNumber - secondNumber;
        assertEquals(result, calculationMethods.subtraction(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test multiplication for numbers")
    public void testMultiplication() {
        long result = firstNumber * secondNumber;
        assertEquals(result, calculationMethods.multiplication(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test division for numbers")
    public void testDivision() {
        float result = (float) firstNumber / secondNumber;
        assertEquals(result, calculationMethods.division(firstNumber, secondNumber));
    }

}