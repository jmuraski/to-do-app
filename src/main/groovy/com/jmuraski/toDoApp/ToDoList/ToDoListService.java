package com.jmuraski.toDoApp.ToDoList;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {

    public List<ToDoList> getToDoLists() {
        return List.of(
                new ToDoList(
                        1L,
                        "Monday List",
                        List.of("Eat breakfast", "Go for a run")
                ),
                new ToDoList(
                        2L,
                        "Tuesday List",
                        List.of("Eat breakfast", "Go for a walk")
                )
        );
    }

    public ToDoList getToDoListByID(long id) {
        ToDoList toDoList = new ToDoList(
                id,
                "Monday List",
                List.of("Eat breakfast", "Go for a run")
        );
        return toDoList;
    }
}
