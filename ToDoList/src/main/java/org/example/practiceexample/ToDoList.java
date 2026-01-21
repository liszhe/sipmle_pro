package org.example.practiceexample;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ToDoList {
    private static HashMap<String, Boolean> toDoList = new HashMap<>();

    public static void createTask(String task) {
        toDoList.put(task, false);
        System.out.println("Запись создана.");
    }

    public static boolean hasTask(String task) {
        return toDoList.containsKey(task);
    }

    public static void updateTask(String task) {
        if (hasTask(task)) {
            toDoList.put(task, true);
            System.out.println("Запись обновлена");
        } else {
            System.out.println("Запись не найдена");
        }
    }

    public static void writeTaskInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ToDoList.txt"))) {
            for (Map.Entry<String, Boolean> entry : toDoList.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
            System.out.println("Файл записан");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
