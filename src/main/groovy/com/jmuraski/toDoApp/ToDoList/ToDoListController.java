package com.jmuraski.toDoApp.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "todolist")
public class ToDoListController {
    private final ToDoListService toDoListService;

    @Autowired
    public ToDoListController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping
    public List<ToDoList> getToDoLists() {
        return toDoListService.getToDoLists();
    }

    @GetMapping(path = "/{id}")
    public ToDoList getToDoList(@PathVariable Long id) {
        return toDoListService.getToDoListByID(id);
    }

//    @PostMapping
//    public ToDoList addToDoList() {
//        return toDoListService.addToDoList();
//    }
//
//    @PutMapping(path = "/{id}")
//    public ToDoList updateToDoList(@PathVariable Long id) {
//        return toDoListService.updateToDoList(id);
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public ToDoList removeToDoList(@PathVariable Long id) {
//        return toDoListService.removeToDoList(id);
//    }
}
