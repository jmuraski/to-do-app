package com.jmuraski.toDoApp.Controller;

import com.jmuraski.toDoApp.Model.ToDoItem;
import com.jmuraski.toDoApp.Service.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "todoitem")
public class ToDoItemController {
    private final ToDoItemService toDoItemService;

    @Autowired
    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @GetMapping(path = "/{listId}")
    public List<ToDoItem> getToDoItemsByListId(@PathVariable Long listId) {
        return toDoItemService.getToDoItemsByList(listId);
    }

    @PostMapping(path = "/{listId}")
    public void addToDoItem(@PathVariable Long listId, @RequestBody ToDoItem toDoItem) {
        toDoItemService.addToDoItem(listId, toDoItem);
    }

    @PutMapping(path = "/{id}")
    public void updateToDoItem(@PathVariable Long id, @RequestBody ToDoItem toDoItem) {
        toDoItemService.updateToDoItem(id, toDoItem);
    }

    @DeleteMapping(path = "/{id}")
    public void removeToDoItem(@PathVariable Long id) {
        toDoItemService.removeToDoItem(id);
    }
}
