package org.example.springexample.userinput;

import java.util.Scanner;

import static org.example.springexample.userinput.AnalyzerInput.*;

public class UserInput {
    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(analyzeInput(scanner.nextLine()));
    }

    public static String analyzeInput(String userInput) {
        String input = userInput.replaceAll(" ", "");
        double result = 0;
        while(hasMathSymbols(input)) {
            if (hasBracket(input)) {
                int firstIdBracket = findIdOpenBracket(input);
                int lastIdBracket = findIdCloseBracket(input);
                String bracketMath = input.substring(firstIdBracket, lastIdBracket + 1);
                result = Double.parseDouble(resultBracket(bracketMath));
                input = input.substring(0, firstIdBracket) + result + input.substring(lastIdBracket + 1);
            }else{
                input = resultMath(input);
            }
        }

        return input;
    }


}
