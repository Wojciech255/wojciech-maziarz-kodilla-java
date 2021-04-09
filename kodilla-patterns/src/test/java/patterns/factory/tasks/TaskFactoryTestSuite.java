package patterns.factory.tasks;

import factory.tasks.Task;
import factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void TaskFactoryTestSuite(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals(shopping.getTaskName(),"Shopping");
        assertEquals(painting.getTaskName(),"Painting");
        assertEquals(driving.getTaskName(),"Driving");
    }
}
