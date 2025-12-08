package org.example.springexample.userinput;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        analyzeInput(scanner.nextLine());
    }

    public static void analyzeInput(String userInput){
        String[] inputArray = userInput.split(" ");
        Arrays.stream(inputArray).toList().forEach(System.out::println);
    }
}
