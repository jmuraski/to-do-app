package com.jmuraski.toDoApp.Service;

import com.jmuraski.toDoApp.Model.ToDoList;
import com.jmuraski.toDoApp.Repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {
    private final ToDoListRepository toDoListRepository;

    @Autowired
    public ToDoListService(ToDoListRepository toDoListRepository) {
        this.toDoListRepository = toDoListRepository;
    }

    public List<ToDoList> getToDoLists() {
        return toDoListRepository.findAll();
    }

    public ToDoList getToDoListByID(Long id) {
        return toDoListRepository.getById(id);
    }

    public void addToDoList(ToDoList toDoList) {
        toDoListRepository.save(toDoList);
    }

    public void updateToDoList(Long id, ToDoList toDoList) {
        ToDoList editedToDoList = toDoListRepository.getById(id);
        editedToDoList.setName(toDoList.getName());
        toDoListRepository.save(editedToDoList);
    }

    public void removeToDoList(Long id) {
        toDoListRepository.deleteById(id);
    }
}
