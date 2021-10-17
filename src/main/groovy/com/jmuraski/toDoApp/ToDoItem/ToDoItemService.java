package com.jmuraski.toDoApp.ToDoItem;

import com.jmuraski.toDoApp.ToDoList.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemService {
    private final ToDoItemRepository toDoItemRepository;

    @Autowired
    public ToDoItemService(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    public List<ToDoItem> getToDoItemsByList(Long listId) {
        //Update "findAll() to correct search
        return toDoItemRepository.findAll();
    }

    public void addToDoItem(Long listId, ToDoItem toDoItem) {
        System.out.println(listId + toDoItem.toString());
    }


}
