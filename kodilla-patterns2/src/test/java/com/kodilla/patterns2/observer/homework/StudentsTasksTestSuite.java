package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsTasksTestSuite {

    @Test
    public void testUpdate() {
        // Given
        StudentsTasks kodilla = new Kodilla();
        Mentor johnSmith = new Mentor("johnSmith");
        Mentor ivoneEscobar = new Mentor("ivoneEscobar");
        kodilla.registerObserver(johnSmith);
        kodilla.registerObserver(ivoneEscobar);
        // When
        kodilla.addTask("New Task");
        kodilla.addTask("New Task 2");
        // Then
        assertEquals(2, johnSmith.getUpdateCount());
    }
}
