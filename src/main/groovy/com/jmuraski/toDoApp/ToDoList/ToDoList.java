package com.jmuraski.toDoApp.ToDoList;

import java.util.List;

public class ToDoList {
    private Long id;
    private String name;
    private List<String> list;

    public ToDoList() {
    }

    public ToDoList(Long id, String name, List<String> list) {
        this.id = id;
        this.name = name;
        this.list = list;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
