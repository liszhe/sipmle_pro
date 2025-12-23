package org.example.springexample.userinput;

import org.example.springexample.calculationmethods.CalculationMath;

import java.util.Arrays;

public class AnalyzerInput {

    public static boolean hasBracket(String input) {
        return input.contains("(");
    }

    public static int findIdOpenBracket(String input) {
        return input.indexOf('(');
    }

    public static int findIdCloseBracket(String input) {
        return input.indexOf(')');
    }

    public static boolean hasMathSymbols(String input) {
        return input.contains("+") || input.contains("-") ||
                input.contains("*") || input.contains("/");
    }

    //
    public static String nextMathSymbolInBracket(String input) {
        String expression = input.replaceAll("[()]", "");
        String partResult = "";

        while (hasMathSymbols(expression)) {
            if (CalculationMath.hasMarkMultiplication(expression) || CalculationMath.hasMarkDivision(expression)) {
                int multiplyIndex = expression.indexOf('*');
                int divideIndex = expression.indexOf('/');
                int operatorIndex = -1;

                if (multiplyIndex > 0 && divideIndex > 0) {
                    operatorIndex = Math.min(multiplyIndex, divideIndex);
                } else if (multiplyIndex > 0) {
                    operatorIndex = multiplyIndex;
                } else if (divideIndex > 0) {
                    operatorIndex = divideIndex;
                }

                if (operatorIndex > 0) {
                    char operator = expression.charAt(operatorIndex);
                    int leftCloseIndex = operatorIndex - 1;
                    int rightCloseIndex = operatorIndex + 1;
                    while (leftCloseIndex > 0 && (Character.isDigit(expression.charAt(leftCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
                        leftCloseIndex--;
                    }
                    while (rightCloseIndex < expression.length() && (Character.isDigit(expression.charAt(rightCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
                        rightCloseIndex++;
                    }

                    partResult = String.valueOf(operator == '*' ?
                            CalculationMath.multiplication(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex))
                                    , Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))) :
                            CalculationMath.division(Float.parseFloat(expression.substring(leftCloseIndex, operatorIndex)),
                                    Float.parseFloat(expression.substring(operatorIndex + 1, rightCloseIndex))));

                    expression = expression.substring(0, leftCloseIndex) + partResult + expression.substring(rightCloseIndex);
                }
            }else if (CalculationMath.hasMarkSummation(expression) || CalculationMath.hasMarkSubtraction(expression)) {
                int summationIndex = expression.indexOf('+');
                int substractionIndex = expression.indexOf('-');
                int operatorIndex = -1;

                if (summationIndex > 0 && substractionIndex > 0) {
                    operatorIndex = Math.min(summationIndex, substractionIndex);
                } else if (summationIndex > 0) {
                    operatorIndex = summationIndex;
                } else if (substractionIndex > 0) {
                    operatorIndex = substractionIndex;
                }

                if (operatorIndex > 0) {
                    char operator = expression.charAt(operatorIndex);
                    int leftCloseIndex = operatorIndex - 1;
                    int rightCloseIndex = operatorIndex + 1;
                    while (leftCloseIndex > 0 && (Character.isDigit(expression.charAt(leftCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
                        leftCloseIndex--;
                    }
                    while (rightCloseIndex < expression.length() && (Character.isDigit(expression.charAt(rightCloseIndex)) || expression.charAt(rightCloseIndex) == '.')){
                        rightCloseIndex++;
                    }

                    partResult = String.valueOf(operator == '+' ?
                            CalculationMath.summation(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex))
                                    , Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))) :
                            CalculationMath.subtraction(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex)),
                                    Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))));

                    expression = expression.substring(0, leftCloseIndex) + partResult + expression.substring(rightCloseIndex);
                }
            }

        }
        return expression;
    }

    public static boolean isLastSymbol(int lengthArray, int lastCheckSymbol) {
        return lengthArray - 1 == lastCheckSymbol;
    }
}
