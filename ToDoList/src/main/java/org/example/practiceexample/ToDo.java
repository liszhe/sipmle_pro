package org.example.practiceexample;

import static org.example.practiceexample.ToDoList.*;
import static org.example.practiceexample.User.getInput;

public class ToDo {
    public static void userChoice(String input){
        while (!input.equals("Выход")){
            input = getInput();
            switch (input){
                case "Добавить":
                    System.out.println("Напишите задание");
                    createTask(getInput());
                case "Проверить":
                    System.out.println("Напишите задание");
                    hasTask(getInput());
                case "Обновить":
                    System.out.println("Напишите задание");
                   updateTask(getInput());
            }
        }
    }
}
