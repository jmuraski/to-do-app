//package com.jmuraski.toDoApp.ToDoList;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class ToDoListConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(ToDoListRepository toDoListRepository) {
//        return args -> {
//            ToDoList list1 = new ToDoList(
//                    "Monday List"
//            );
//
//            ToDoList list2 = new ToDoList(
//                    "Tuesday List"
//            );
//
//            toDoListRepository.saveAll(
//                    List.of(list1, list2)
//            );
//        };
//    }
//}
