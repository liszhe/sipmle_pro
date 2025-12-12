package org.example.springexample.userinput;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.springexample.userinput.AnalyzatorInput.*;

public class UserInput {
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        analyzeInput(scanner.nextLine());
    }

    public static void analyzeInput(String userInput) {
        String[] inputArray = userInput.replace(" ", "").split("");
        if (checkIsBracket(inputArray)) {
            int firstIdBracket = findIdFirstBracket(inputArray);
            int lastIdBracket = findIdLastBracket(inputArray);
            nextMathSymbol(inputArray, firstIdBracket, lastIdBracket);
        }


    }


}
