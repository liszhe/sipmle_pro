package org.example.springexample.userinput;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        analyzeInput(scanner.nextLine());
    }

    public static void analyzeInput(String userInput){
        String[] inputArray = userInput.split("");
        for (String symbol : inputArray){
            checkIsBracket(symbol);
        }


    }

    public static boolean checkIsBracket(String input){
        if(input.contains("(")){
            return true;
        }
        return false;
    }
}
