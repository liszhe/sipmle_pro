package org.example.springexample.calculationexeptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationExceptionsTest {

    @Test
    @DisplayName("Test check division by zero")
    public void testCheckDivisionSecondNumber() {
        assertThrows(ArithmeticException.class, () -> CalculationExceptions.checkDivisionSecondNumber(0));
    }

}