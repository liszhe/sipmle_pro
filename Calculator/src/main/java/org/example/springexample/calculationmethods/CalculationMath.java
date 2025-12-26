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

    public static double division(double firstNumber, double secondNumber) {
        CalculationControl.checkDivisionSecondNumber((float) secondNumber);
        return firstNumber / secondNumber;
    }

    public static boolean hasOperatorSummation(String input){
        return input.contains("+");
    }

    public static boolean hasOperatorSubtraction(String input){
        return input.contains("-");
    }

    public static boolean hasOperatorMultiplication(String input){
        return input.contains("*");
    }

    public static boolean hasOperatorDivision(String input){
        return input.contains("/");
    }
}
