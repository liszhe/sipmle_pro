package org.example.springexample.calculationmethods;

import org.example.springexample.calculationexeptions.CalculationControl;

public class CalculationMath {

    public static double summation(long firstNumber, long secondNumber) {
        return Math.addExact(firstNumber, secondNumber);
    }

    public static double subtraction(long firstNumber, long secondNumber) {
        return Math.subtractExact(firstNumber, secondNumber);
    }

    public static double multiplication(long firstNumber, long secondNumber) {
        return Math.multiplyExact(firstNumber, secondNumber);
    }

    public static double division(float firstNumber, float secondNumber) {
        CalculationControl.checkDivisionSecondNumber(secondNumber);
        return firstNumber / secondNumber;
    }

    public static boolean hasMarkSummation(String input){
        return input.contains("+");
    }

    public static boolean hasMarkSubtraction(String input){
        return input.contains("-");
    }

    public static boolean hasMarkMultiplication(String input){
        return input.contains("*");
    }

    public static boolean hasMarkDivision(String input){
        return input.contains("+");
    }
}
