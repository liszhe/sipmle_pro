package org.example.springexample.userinput;

import org.example.springexample.calculationmethods.CalculationMath;

public class AnalyzerInput {

    public static boolean checkIsBracket(String input) {
        return input.contains("(");
    }

    public static int findIdFirstOpenBracket(String input) {
        return input.indexOf('(');
    }

    public static int findIdLastCloseBracket(String input) {
        return input.indexOf(')');
    }

    public static double nextMathSymbolInBracket(String input, int firstBracketId, int lastBracketId) {
        double result = 0;
        for (int numberSymbol = firstBracketId; numberSymbol < lastBracketId; numberSymbol++) {
            if (CalculationMath.hasMarkMultiplication(input)) {
                input =input.substring(input.indexOf('*') - 1, input.indexOf('*') + 1);
                result = CalculationMath.multiplication(Long.parseLong(input.substring(input.indexOf('*') - 1, input.indexOf('*') + 1))
                        , Long.parseLong(input.substring(input.indexOf('*') + 1, input.indexOf('*') + 2)));
            }
        }
        return result;
    }

//    public static double nextMathSymbol(String[] input, int lengthArray, int lastFindId) {
//        double result = 0;
//        for (int numberSymbol = lastFindId; numberSymbol < lengthArray; numberSymbol++) {
//            if (input[numberSymbol].matches("[+-/*]")) {
//                result = whichMathSymbol(input[numberSymbol],
//                        Integer.parseInt(input[numberSymbol - 1]),
//                        Integer.parseInt(input[numberSymbol + 1]));
//            }
//        }
//        return result;
//    }

    public static boolean isLastSymbol(int lengthArray, int lastCheckSymbol) {
        return lengthArray - 1 == lastCheckSymbol;
    }
}
