package org.example.springexample.calculationmethods;

import org.example.springexample.calculationexeptions.CalculationExceptions;

public class CalculationMethods {

    public long summation(long firstNumber, long secondNumber) {
        return Math.addExact(firstNumber, secondNumber);
    }

    public long subtraction(long firstNumber, long secondNumber) {
        return Math.subtractExact(firstNumber, secondNumber);
    }

    public long multiplication(long firstNumber, long secondNumber) {
        return Math.multiplyExact(firstNumber, secondNumber);
    }

    public float division(float firstNumber, float secondNumber) {
        CalculationExceptions.checkDivisionSecondNumber(secondNumber);
        return firstNumber / secondNumber;
    }
}
