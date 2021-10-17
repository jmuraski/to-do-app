//package com.jmuraski.toDoApp.ToDoItem;
//
//import com.jmuraski.toDoApp.ToDoList.ToDoList;
//import com.jmuraski.toDoApp.ToDoList.ToDoListRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//
//import java.util.List;
//
//public class ToDoItemConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(ToDoItemRepository toDoItemRepository) {
//        return args -> {
//            ToDoItem item1 = new ToDoItem(
//                    "Monday item"
//            );
//
//            ToDoItem item2 = new ToDoItem(
//                    "Tuesday item"
//            );
//
//            toDoItemRepository.saveAll(
//                    List.of(item1, item2)
//            );
//        };
//    }
//}
