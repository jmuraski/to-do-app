package com.jmuraski.toDoApp.ToDoList;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ToDoList {
    @Id
    @SequenceGenerator(
            name = "todolist_sequence",
            sequenceName = "todolist_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todolist_sequence"
    )
    private Long id;
    private String name;

    public ToDoList() {
    }

    public ToDoList(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
