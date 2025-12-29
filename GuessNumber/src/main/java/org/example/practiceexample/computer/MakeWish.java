package org.example.practiceexample.computer;

import org.example.practiceexample.user.UserData;

import static org.example.practiceexample.user.Input.getInput;

public class MakeWish {
    private final UserData userData = new UserData();
    private final long wishNumber = (long) Math.random();
    private long score = 0;

    public void chooseGame() {
        System.out.println("Choose Game:\n" +
                "1) With life\n" +
                "2) With score" +
                "Write number which ur choose");
        String input = getInput();
        if (input.equals("1")) {
            System.out.println("Write how many life u want: ");
            userData.setUserLife(Long.parseLong(getInput()));
            guessNumberWithLife(userData.getUserLife());
        } else if (input.equals("2")) {
            guessNumberWithScore();
        }
    }

    private void guessNumberWithLife(long number) {
        long numberLife = number;
        while (numberLife > 0) {
            System.out.print("Write number: ");
            userData.setUserNumber(Long.parseLong(getInput()));
            if (userData.getUserNumber() == wishNumber) {
                System.out.println("U guess number :)");
            }else {
                System.out.println("U couldn't guess number, let's try again :(");
            }
            numberLife--;
        }
    }

    private void guessNumberWithScore() {
        boolean heCanGuess = false;
        while (!heCanGuess){
            System.out.print("Write number: ");
            userData.setUserNumber(Long.parseLong(getInput()));
            if (userData.getUserNumber() == wishNumber){
                heCanGuess = true;
            }
            score++;
        }
        System.out.println("Score ur's attempts: " + score);
    }
}
