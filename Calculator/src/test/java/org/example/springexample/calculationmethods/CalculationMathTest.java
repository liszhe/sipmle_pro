package org.example.springexample.calculationmethods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.springexample.calculationmethods.CalculationMath.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculationMathTest {

    private final double firstNumber = 5;
    private final double secondNumber = 2;

    private final String string = "+-*/";

    @Test
    @DisplayName("Test summation for numbers")
    public void testSummation() {
        double result = firstNumber + secondNumber;
        assertEquals(result, summation(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test subtraction for numbers")
    public void testSubtraction() {
        double result = firstNumber - secondNumber;
        assertEquals(result, subtraction(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test multiplication for numbers")
    public void testMultiplication() {
        double result = firstNumber * secondNumber;
        assertEquals(result, multiplication(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test division for numbers")
    public void testDivision() {
        double result = (float) firstNumber / secondNumber;
        assertEquals(result, division(firstNumber, secondNumber));
    }

    @Test
    @DisplayName("Test check has operator summation")
    public void testHasOperatorSummation(){
        assertTrue(hasOperatorSummation(string));
    }

    @Test
    @DisplayName("Test check has operator subtraction")
    public void testHasOperatorSubtraction(){
        assertTrue(hasOperatorSubtraction(string));
    }

    @Test
    @DisplayName("Test check has operator multiplication")
    public void testHasOperatorMultiplication(){
        assertTrue(hasOperatorMultiplication(string));
    }

    @Test
    @DisplayName("Test check has operator division")
    public void testHasOperatorDivision(){
        assertTrue(hasOperatorDivision(string));
    }
}