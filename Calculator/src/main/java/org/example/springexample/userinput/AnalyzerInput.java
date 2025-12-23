package org.example.springexample.userinput;

import static org.example.springexample.calculationmethods.CalculationMath.*;

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

    public static String resultBracket(String input) {
        String expression = input.replaceAll("[()]", "");

        while (hasMathSymbols(expression)) {
            if (hasMarkMultiplication(expression) || hasMarkDivision(expression)) {
                int operatorIndex = getIndexMultiplicationAndDivision(expression);
                if (operatorIndex > 0) {
                    expression = getResultMultiplicationAndDivision(expression, operatorIndex);
                }
            } else if (hasMarkSummation(expression) || hasMarkSubtraction(expression)) {
                int operatorIndex = getIndexSummationAndSubtraction(expression);

                if (operatorIndex > 0) {
                    expression = getResultSummationAndSubtraction(expression, operatorIndex);
                }
            }

        }
        return expression;
    }

    public static String resultMath(String input) {
        String expression = input;

        while (hasMathSymbols(expression)) {
            if (hasMarkMultiplication(expression) || hasMarkDivision(expression)) {
                int operatorIndex = getIndexMultiplicationAndDivision(expression);
                if (operatorIndex > 0) {
                    expression = getResultMultiplicationAndDivision(expression, operatorIndex);
                }
            } else if (hasMarkSummation(expression) || hasMarkSubtraction(expression)) {
                int operatorIndex = getIndexSummationAndSubtraction(expression);

                if (operatorIndex > 0) {
                    expression = getResultSummationAndSubtraction(expression, operatorIndex);
                }
            }

        }
        return expression;
    }

    private static String getResultMultiplicationAndDivision(String expression, int operatorIndex) {
        String result;
        char operator = expression.charAt(operatorIndex);
        int leftCloseIndex = operatorIndex - 1;
        int rightCloseIndex = operatorIndex + 1;
        while (leftCloseIndex > 0 && (Character.isDigit(expression.charAt(leftCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
            leftCloseIndex--;
        }
        while (rightCloseIndex < expression.length() && (Character.isDigit(expression.charAt(rightCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
            rightCloseIndex++;
        }
        result = String.valueOf(operator == '*' ?
                multiplication(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex))
                        , Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))) :
                division(Float.parseFloat(expression.substring(leftCloseIndex, operatorIndex)),
                        Float.parseFloat(expression.substring(operatorIndex + 1, rightCloseIndex))));
        return expression.substring(0, leftCloseIndex) + result + expression.substring(rightCloseIndex);
    }

    private static String getResultSummationAndSubtraction(String expression, int operatorIndex) {
        String result;
        char operator = expression.charAt(operatorIndex);
        int leftCloseIndex = operatorIndex - 1;
        int rightCloseIndex = operatorIndex + 1;
        while (leftCloseIndex > 0 && (Character.isDigit(expression.charAt(leftCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
            leftCloseIndex--;
        }
        while (rightCloseIndex < expression.length() && (Character.isDigit(expression.charAt(rightCloseIndex)) || expression.charAt(leftCloseIndex) == '.')) {
            rightCloseIndex++;
        }
        result = String.valueOf(operator == '+' ?
                summation(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex))
                        , Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))) :
                subtraction(Double.parseDouble(expression.substring(leftCloseIndex, operatorIndex)),
                        Double.parseDouble(expression.substring(operatorIndex + 1, rightCloseIndex))));
        return expression.substring(0, leftCloseIndex) + result + expression.substring(rightCloseIndex);
    }

    private static int getIndexMultiplicationAndDivision(String expression) {
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
        return operatorIndex;
    }

    private static int getIndexSummationAndSubtraction(String expression) {
        int summationIndex = expression.indexOf('+');
        int subtractionIndex = expression.indexOf('-');
        int operatorIndex = -1;

        if (summationIndex > 0 && subtractionIndex > 0) {
            operatorIndex = Math.min(summationIndex, subtractionIndex);
        } else if (summationIndex > 0) {
            operatorIndex = summationIndex;
        } else if (subtractionIndex > 0) {
            operatorIndex = subtractionIndex;
        }
        return operatorIndex;
    }
}
