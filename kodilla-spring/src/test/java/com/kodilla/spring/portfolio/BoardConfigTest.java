package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardConfigTest {
    @Autowired
    private Board board;
    @Autowired
    private TaskList toDoList;
    @Autowired
    private TaskList inProgresList;
    @Autowired
    private  TaskList doneList;

    @Test
    public void shouldAddTask() {
        //Given
        toDoList.getTasks().add("Test");
        inProgresList.getTasks().add("Test 2");
        doneList.getTasks().add("Test 3");


        //When
        //Then
        Assertions.assertEquals("Test", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Test 2", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Test 3", board.getDoneList().getTasks().get(0));
    }
}