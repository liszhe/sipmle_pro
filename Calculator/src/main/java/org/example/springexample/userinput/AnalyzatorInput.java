package org.example.springexample.userinput;

import org.example.springexample.calculationmethods.CalculationMath;

public class AnalyzatorInput {
    public static boolean checkIsBracket(String[] input) {
        for (String symbol : input) {
            if (symbol.contains("("))
                return true;
        }
        return false;
    }

    public static int findIdFirstBracket(String[] input) {
        for (int numberSymbol = 0; numberSymbol < input.length; numberSymbol++) {
            if (input[numberSymbol].contains("(")) return numberSymbol;
        }
        return 0;
    }

    public static int findIdLastBracket(String[] input) {
        for (int numberSymbol = 0; numberSymbol < input.length; numberSymbol++) {
            if (input[numberSymbol].contains(")")) return numberSymbol;
        }
        return 0;
    }

    public static void nextMathSymbol(String[] input, int firstBracketId, int lastBracketId) {
        for (int numberSymbol = firstBracketId; numberSymbol < lastBracketId; numberSymbol++) {

        }
    }

    private static void whichMathSymbol(String symbol){
        switch (symbol) {
            case "+":
                CalculationMath.summation(Integer.getInteger(input[numberSymbol - 1])
                        , Integer.getInteger(input[numberSymbol + 1]));
                break;
            case "-":
                CalculationMath.subtraction(Integer.getInteger(input[numberSymbol - 1])
                        , Integer.getInteger(input[numberSymbol + 1]));
                break;
            case "/":
                CalculationMath.division(Integer.getInteger(input[numberSymbol - 1])
                        , Integer.getInteger(input[numberSymbol + 1]));
                break;
            case "*":
                CalculationMath.multiplication(Integer.getInteger(input[numberSymbol - 1])
                        , Integer.getInteger(input[numberSymbol + 1]));
                break;
        }
    }
}
