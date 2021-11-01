package com.jmuraski.toDoApp.Controller;

import com.jmuraski.toDoApp.Model.ToDoList;
import com.jmuraski.toDoApp.Service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void addToDoList(@RequestBody ToDoList toDoList) {
        toDoListService.addToDoList(toDoList);
    }


    @PutMapping(path = "/{id}")
    public void updateToDoList(@PathVariable Long id, @RequestBody ToDoList toDoList) {
        toDoListService.updateToDoList(id, toDoList);
    }

    @DeleteMapping(path = "/{id}")
    public void removeToDoList(@PathVariable Long id) {
        toDoListService.removeToDoList(id);
    }
}
