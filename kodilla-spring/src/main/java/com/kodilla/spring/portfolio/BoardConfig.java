package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {


    @Bean
    public Board board(TaskList toDoList,TaskList inProgresList,TaskList doneList) {
        return new Board(toDoList,inProgresList,doneList);
    }
    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }
    @Bean
    public TaskList inProgresList(){
        return new TaskList();
    }
    @Bean
    public TaskList doneList(){
        return new TaskList();
    }
}
