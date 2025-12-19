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
        int opIndex = -1;
        char operator = ' ';

        while (hasMathSymbols(input)) {
            if (CalculationMath.hasMarkMultiplication(expression) || CalculationMath.hasMarkDivision(expression)) {

                if (CalculationMath.hasMarkMultiplication(expression)) {
                    int multiplyIndex = expression.indexOf('*');
                }
                else if(CalculationMath.hasMarkSummation(expression)) {
                    int divideIndex = expression.indexOf('/');
                }

                partResult = Double.toString(CalculationMath.multiplication(
                        Long.parseLong(input.substring(input.indexOf('*') - 1, input.indexOf('*'))),
                        Long.parseLong(input.substring(input.indexOf('*') + 1, input.indexOf('*') + 2))
                ));
                input = input.replaceFirst("\\*", partResult);
                input = input.substring(0, input.indexOf(partResult) - 2)
                        + input.substring(input.indexOf(partResult), input.indexOf(partResult) + 1);
            }

        }
        return input;
    }

    public static boolean isLastSymbol(int lengthArray, int lastCheckSymbol) {
        return lengthArray - 1 == lastCheckSymbol;
    }
}
