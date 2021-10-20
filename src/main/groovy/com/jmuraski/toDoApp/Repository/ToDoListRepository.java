package com.jmuraski.toDoApp.Repository;

import com.jmuraski.toDoApp.Model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends JpaRepository<ToDoList, Long> {

}
