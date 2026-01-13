package org.example.practiceexample;

import java.util.HashMap;

public class ToDoList {
        private static HashMap<String, Boolean> toDoList = new HashMap<>();

        public static void createTask(String task){
            toDoList.put(task, false);
            System.out.println("Запись создана.");
        }

        public static boolean hasTask(String task){
            return toDoList.containsKey(task);
        }

        public static void updateTask(String task){
            if(hasTask(task)){
                toDoList.put(task, true);
                System.out.println("Запись обновлена");
            }
            else {
                System.out.println("Запись не найдена");
            }
        }
}
