package org.example.practiceexample;

import static org.example.practiceexample.ToDoList.*;
import static org.example.practiceexample.User.getInput;

public class ToDo {
    private static String task = "";
    public static void userChoice(String input){
        while (!input.equals("Выход")){
            input = getInput();
            switch (input){
                case "Добавить":
                    System.out.println("Напишите задание");
                    task = getInput();
                    createTask(task);
                    break;
                case "Проверить":
                    System.out.println("Напишите задание");
                    task = getInput();
                    hasTask(task);
                    break;
                case "Обновить":
                    System.out.println("Напишите задание");
                    task = getInput();
                    updateTask(task);
                    break;
                case "Записать файл":
                    writeTaskInFile();
            }
        }
    }
}
