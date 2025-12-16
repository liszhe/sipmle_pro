package org.example.springexample.userinput;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.springexample.userinput.AnalyzerInput.*;

public class UserInput {
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(analyzeInput(scanner.nextLine()));
    }

    public static double analyzeInput(String userInput) {
        String input = Arrays.toString(userInput.replace(" ", "").split(""));
        double result = 0;
        if (checkIsBracket(userInput)) {
            int firstIdBracket = findIdFirstOpenBracket(userInput);
            int lastIdBracket = findIdLastCloseBracket(userInput);
            result += nextMathSymbolInBracket(input, firstIdBracket, lastIdBracket);
//            if (!AnalyzerInput.isLastSymbol(inputArray.length, lastIdBracket)) {
//                nextMathSymbol(inputArray, inputArray.length, lastIdBracket);
//            }
        }

        return result;
    }


}
