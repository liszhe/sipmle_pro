package org.example.practiceexample;

import static org.example.practiceexample.ToDo.userChoice;
import static org.example.practiceexample.User.getInput;

public class ToDoStart {
    public static void main(String[] args) {
        System.out.println("Выберите действие:\n" +
                "1) Добавить\n" +
                "2) Проверить\n" +
                "3) Обновить\n" +
                "4) Выход");
        userChoice(getInput());
    }
}