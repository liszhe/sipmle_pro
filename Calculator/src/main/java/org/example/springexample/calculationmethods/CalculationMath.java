package org.example.springexample.calculationmethods;

import org.example.springexample.calculationexeptions.CalculationExceptions;

public class CalculationMath {

    public static long summation(long firstNumber, long secondNumber) {
        return Math.addExact(firstNumber, secondNumber);
    }

    public static long subtraction(long firstNumber, long secondNumber) {
        return Math.subtractExact(firstNumber, secondNumber);
    }

    public static long multiplication(long firstNumber, long secondNumber) {
        return Math.multiplyExact(firstNumber, secondNumber);
    }

    public static float division(float firstNumber, float secondNumber) {
        CalculationExceptions.checkDivisionSecondNumber(secondNumber);
        return firstNumber / secondNumber;
    }
}
