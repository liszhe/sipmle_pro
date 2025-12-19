package org.example.springexample.calculationexeptions;

public class CalculationControl {
    public static void checkDivisionSecondNumber(float checkNumber) {
        if (checkNumber == 0) throw new ArithmeticException("Division by zero");
    }
}