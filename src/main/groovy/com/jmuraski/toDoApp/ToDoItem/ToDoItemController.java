package com.jmuraski.toDoApp.ToDoItem;

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

//    @PutMapping(path = "/{id}")
//    public ToDoItem updateToDoItem(@PathVariable Long id) {
//        return ToDoItemService.updateToDoItem(id);
//    }
//
//    @DeleteMapping(path = "/{id}")
//    public void deleteToDoItem(@PathVariable Long id) {
//        ToDoItemService.removeToDoItem(id);
//    }
}
