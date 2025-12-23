package org.example.springexample.calculationmethods;

import org.example.springexample.calculationexeptions.CalculationControl;

public class CalculationMath {

    public static double summation(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
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
        return input.contains("/");
    }
}
