/*package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "Test: ListName";
    @Test
    void testFindByListName(){

        //Given
        TaskList taskList = new TaskList(LISTNAME,"DESCRIPTION");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        Assertions.assertEquals(1,readTaskList.size());

        //CleanUp
        taskListDao.delete(taskList);
    }
}
*/