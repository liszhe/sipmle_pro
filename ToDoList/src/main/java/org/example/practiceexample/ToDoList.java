package org.example.practiceexample;

import java.util.HashMap;

import static org.example.practiceexample.User.getInput;

public class ToDoList {
        private HashMap<String, Boolean> toDoList = new HashMap<>();

        public void createTask(){
            toDoList.put(getInput(), false);
        }
}
