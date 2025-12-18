package org.example.springexample.userinput;

import java.util.Scanner;

import static org.example.springexample.userinput.AnalyzerInput.*;

public class UserInput {
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(analyzeInput(scanner.nextLine()));
    }

    public static double analyzeInput(String userInput) {
        String input = userInput.replaceAll(" ", "");
        double result = 0;
        if (hasBracket(input)) {
            int firstIdBracket = findIdOpenBracket(input);
            int lastIdBracket = findIdCloseBracket(input);
            String bracketMath = input.substring(firstIdBracket, lastIdBracket + 1);
            result += Double.parseDouble(nextMathSymbolInBracket(bracketMath));
//            if (!AnalyzerInput.isLastSymbol(inputArray.length, lastIdBracket)) {
//                nextMathSymbol(inputArray, inputArray.length, lastIdBracket);
//            }
        }

        return result;
    }


}
