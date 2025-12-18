package org.example.springexample.userinput;

import org.example.springexample.calculationmethods.CalculationMath;

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
        return input.contains("[+-/*]");
    }

    public static String nextMathSymbolInBracket(String input) {
        String partResult = "";
        while (hasMathSymbols(input)) {
            if (CalculationMath.hasMarkMultiplication(input)) {
                partResult = Double.toString(CalculationMath.multiplication(
                        Long.parseLong(input.substring(input.indexOf('*') - 1, input.indexOf('*'))),
                        Long.parseLong(input.substring(input.indexOf('*') + 1, input.indexOf('*') + 2))
                ));
                input = input.replaceFirst("\\*", partResult);
                input = input.substring(0, input.indexOf(partResult) - 2)
                        + input.substring(input.indexOf(partResult));
//            } else if (CalculationMath.hasMarkDivision(input)) {
//                result += CalculationMath.division(Long.parseLong(input.substring(input.indexOf('/') - 1, input.indexOf('*'))),
//                        Long.parseLong(input.substring(input.indexOf('/') + 1, input.indexOf('/') + 2)));
//            } else if (CalculationMath.hasMarkSummation(input)) {
//                result += CalculationMath.subtraction(Long.parseLong(input.substring(input.indexOf('-') - 1, input.indexOf('*'))),
//                        Long.parseLong(input.substring(input.indexOf('-') + 1, input.indexOf('-') + 2)));
//            } else if (CalculationMath.hasMarkSubtraction(input)) {
//                result += CalculationMath.summation(Long.parseLong(input.substring(input.indexOf('+') - 1, input.indexOf('*'))),
//                        Long.parseLong(input.substring(input.indexOf('+') + 1, input.indexOf('+') + 2)));
//
//            }
            }

        }
        return input;
    }

    public static boolean isLastSymbol(int lengthArray, int lastCheckSymbol) {
        return lengthArray - 1 == lastCheckSymbol;
    }
}
