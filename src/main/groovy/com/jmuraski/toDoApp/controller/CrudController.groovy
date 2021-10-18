package com.jmuraski.toDoApp.controller

import com.jmuraski.toDoApp.entity.ToDoItem
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.CompletableFuture

@RestController
@Validated
class CrudController {
    Logger log = LoggerFactory.getLogger(CrudController.class);

    @GetMapping("/{id}")
    ToDoItem getToDoItem(@PathVariable String id){
        ToDoItem item = new ToDoItem()
        item.id = id
        item.description = "The id is $id and I just made up this description"

        return item
    }

    @PostMapping("")
    ToDoItem createToDoItem(@RequestBody ToDoItem item) {
        log.info("Received Item ${item?.id} with ${item?.description} ")
        return item
    }
}
